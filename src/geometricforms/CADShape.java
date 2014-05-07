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

    protected Boolean Selected = false;
    protected BufferedImage ResizeIcon;

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

    private void Initialise() {

        setOpaque(false);
        LoadImageApp();
        

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

                setLocation(getX() + e.getX() - ClickOffsetPoint.x, getY() + e.getY() - ClickOffsetPoint.y);

                repaint();

            }

        });

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        g.setColor(DrawColor);
        g.drawImage(ResizeIcon, 0, 0, 50, 50, this);
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

    public void LoadImageApp() {
        try {
            ResizeIcon = ImageIO.read(new File("\\Resources\\ResizeIcon.jpg"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Datei für ResizeIcon nicht gefunden", "Fehler beim IconLaden", JOptionPane.OK_CANCEL_OPTION);
        }
    }
}
