/**
 * *****************************************************************************
 * Class:	CADShape.java
 * *****************************************************************************
 * Company:	Berner Fachhochschule für Technik und Informatik
 *
 * Author:	Daniel Ziörjen
 *
 * Datum: 04.06.2014
 *
 * Project:	CADNetBean
 *
 * Describtion:	
 * Diese Klasse erstellt ein  Jpanel in welchem geometrische Objekte gezeichnet
 * werden können. Durch das ableiten dieser Klasse und dem Implementieren der abstrakten
 * Methoden kann jeweils ein solches geometrisches Objekt definiert werden.
 * Diese Klasse implementiert ausserdem alle Mouse-Aktionen wie Drag, Resize, Click ect.
 * Alle abgeleiteten Klassen verfügen somit bereits schon diese Funktionalität.
 * 
 * ******************************************************************************
 */
package geometricforms;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Daxx
 */
public abstract class CADShape extends JPanel {

    private static final long serialVersionUID = 1L;
    public Point ClickOffsetPoint = new Point();
    public Color DrawColor = Color.black;
    public Color FillColor =new Color(255,255,255,0);
    public float LineThickness =1f;
    protected Boolean Selected = false;
    protected int iconsize=30;
    protected Rectangle iconframe;

    public Boolean getSelected() {
        return Selected;
    }

    public void setSelected(Boolean selected) {

        PropertyEvent.firePropertyChange("Selected", getSelected(), selected);
        Selected = selected;
        repaint();
  
        if(selected){
            setOpaque(false);
            setCursor(new Cursor(Cursor.MOVE_CURSOR));
        }
    }

    protected Shape ShapeStyle;
    
    public abstract Shape getShapeStyle();
    public abstract void setShapeStyle(Shape value);

    private PropertyChangeSupport PropertyEvent = new PropertyChangeSupport(this);

    public CADShape() {
    }

    public CADShape(Point Koord) {

        setBounds(Koord.x, Koord.y, 0, 0);
        Initialise();
    }

    public CADShape(Rectangle Frame) {

        setBounds(Frame);
        Initialise();

    }
    
    public CADShape(CADShape copy) {

        setBounds(copy.getBounds().x+10,copy.getBounds().y+10,copy.getBounds().width,copy.getBounds().height);
        DrawColor=copy.DrawColor;
        FillColor=copy.FillColor;
        LineThickness=copy.LineThickness;
        
        Initialise();
        
    }
    
    abstract void InitShapeStyle();

    public  void Initialise() {

        InitShapeStyle();
        setOpaque(false);
        InitMouseListener();
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(FillColor);
        g2.fill(getShapeStyle());     
        g2.setStroke(new BasicStroke(LineThickness));
        g2.setColor(DrawColor);
        g2.draw(getShapeStyle());
        
        if (getSelected() == true) {

            try {
                g.drawImage(ImageIO.read(new File("src\\images\\ResizeIcon3.gif")),iconframe.x,iconframe.y,iconframe.width,iconframe.height,this);
            } catch (IOException ex) {
                Logger.getLogger(CADShape.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Datei in "+ System.getProperty("user.dir").toString()+" nicht gefunden", "Fehler beim IconLaden", JOptionPane.OK_CANCEL_OPTION);
            }
        }  
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        PropertyEvent.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        PropertyEvent.removePropertyChangeListener(listener);
    }


    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        
        iconframe= new Rectangle(width-iconsize,height-iconsize,iconsize,iconsize);
    }
    
    
    public void InitMouseListener(){
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                setSelected(true);          
            }

            @Override
            public void mousePressed(MouseEvent arg0) {

                ClickOffsetPoint = arg0.getPoint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                super.mouseEntered(e);

                if (getSelected() == false) {
                   setOpaque(true);
                   setForeground(new Color(105,105,105,255));    
                }
                
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                super.mouseExited(e);
                
                if(getSelected()==false){
                    setOpaque(false);
                }
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {

                super.mouseDragged(e);

                if(iconframe.contains(e.getPoint())){//falls klick innerhalb resizeicon -> Fenstergrösse verändern
                    
                    setBounds(getBounds().x,getBounds().y,getBounds().width+(e.getX()- ClickOffsetPoint.x),getBounds().height+(e.getY()-ClickOffsetPoint.y));
                    ClickOffsetPoint=e.getPoint();
                }
                else {
                    setLocation(getX() + e.getX() - ClickOffsetPoint.x, getY() + e.getY() - ClickOffsetPoint.y);//position verändern
                }
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {//mousezeiger anhand position verändern
                if(Selected){
                    if(iconframe.contains(e.getPoint()))
                        setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
                    else
                        setCursor(new Cursor(Cursor.MOVE_CURSOR));                    
                }               
            }
        });
    }
    
}
