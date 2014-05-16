/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricforms;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Daxx
 */
public class CADShape extends JPanel {

    private static final long serialVersionUID = 1L;
    public Point ClickOffsetPoint = new Point();
    public Color DrawColor = Color.black;
    public Color FillColor =Color.red;//TODO: Für Testzwecke
    public boolean IsFilled;
    
    protected Boolean Selected = false;
//    protected BufferedImage ResizeIcon;
    protected int iconsize=30;
    protected Rectangle iconframe;

    public Boolean getSelected() {
        return Selected;
    }

    public void setSelected(Boolean selected) {

        PropertyEvent.firePropertyChange("Selected", getSelected(), selected);
        Selected = selected;

    }

    public int LayerLevel = 0;

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

        setBounds(copy.getBounds().x+10,copy.getBounds().y+10,copy.getBounds().width+10,copy.getBounds().height+10);
        DrawColor=copy.DrawColor;
        FillColor=copy.FillColor;
        IsFilled=copy.IsFilled;
        
        Initialise();
        
    }

    private void Initialise() {

        setOpaque(false);
//        LoadImageApp();
        

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
                    setBackground(Color.lightGray);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                super.mouseExited(e);
                
                if(getSelected()==false){
                setOpaque(false);
                setBackground(Color.white);
                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {

                super.mouseDragged(e);//TODO: Vielleicht überflüssig

                if(iconframe.contains(e.getPoint())){
                      
                    setBounds(getBounds().x,getBounds().y,getBounds().width+(e.getX()- ClickOffsetPoint.x),getBounds().height+(e.getY()-ClickOffsetPoint.y));
                    ClickOffsetPoint=e.getPoint();
                }
                else {
                    setLocation(getX() + e.getX() - ClickOffsetPoint.x, getY() + e.getY() - ClickOffsetPoint.y);
                }
                repaint();

            }

        });

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        
//        g.setColor(DrawColor);
        
        if (getSelected() == true) {

            try {
                //            g.drawImage(ResizeIcon, getWidth() - iconsize, getHeight() - iconsize, iconsize, iconsize, this);
                g.drawImage(ImageIO.read(new File("src\\images\\ResizeIcon.jpg")),iconframe.x,iconframe.y,iconframe.width,iconframe.height,this);
            } catch (IOException ex) {
                Logger.getLogger(CADShape.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Datei in "+ System.getProperty("user.dir").toString()+" nicht gefunden", "Fehler beim IconLaden", JOptionPane.OK_CANCEL_OPTION);
            }
//             g.drawImage(ResizeIcon,iconframe.x,iconframe.y,iconframe.width,iconframe.height,this);
        }
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
//        super.addPropertyChangeListener(listener); //To change body of generated methods, choose Tools | Templates.
        PropertyEvent.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
//        super.removePropertyChangeListener(listener); //To change body of generated methods, choose Tools | Templates.
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
                    setBackground(Color.lightGray);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                super.mouseExited(e);
                
                if(getSelected()==false){
                setOpaque(false);
                setBackground(Color.white);
                }
            }
        });
    }
    
}
