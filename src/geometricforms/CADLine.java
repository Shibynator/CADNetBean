/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricforms;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Daxx
 */
public class CADLine extends CADShape{
    
    public CADLine(){
             
    }
    
    public CADLine(Point Koord){
        
        super(Koord);
        
    }
    
    public CADLine(CADShape copy){
		
		super(copy);
		
	}

    @Override
    public void paint(Graphics g) {
         
        g.drawLine(0,0,getBounds().width-1,getBounds().height-1);
        super.paint(g);
    }

    @Override
    public Shape getShapeStyle() {
        double diagonale= Math.sqrt(Math.pow(getBounds().width, 2)+Math.pow(getBounds().height, 2));
//        double yoffset=getBounds().height/diagonale*LineThickness*0.5;
//        double xoffset=getBounds().width/diagonale*LineThickness*0.5;
//        double yoffset=Math.sin(getBounds().width/(getBounds().height))*LineThickness;
//        double xoffset=Math.cos(getBounds().width/(getBounds().height))*LineThickness;
//        double yoffset=Math.cos(Math.abs(Math.atan(getBounds().height/(getBounds().width))))*LineThickness*2;
//        double xoffset=Math.sin(Math.abs(Math.atan(getBounds().height/(getBounds().width))))*LineThickness*2;
//          double xoffset=5*Math.abs(getBounds().width-LineThickness)/Math.sqrt(Math.pow(getBounds().width-LineThickness, 2)+Math.pow(getBounds().height, 2));
//          double yoffset=5*Math.signum(getBounds().width-LineThickness)*getBounds().height/Math.sqrt(Math.pow(getBounds().width-LineThickness, 2)+Math.pow(getBounds().height, 2));
//         double xoffset=2*getBounds().width*(LineThickness/diagonale);
//         double yoffset=2*getBounds().height*(LineThickness/diagonale);
        
        double yoffset=0;
        double xoffset=0;
        
//        ((Line2D)ShapeStyle).setLine(yoffset,xoffset , getWidth()-2*xoffset, getHeight()-2*xoffset);
        ((Line2D)ShapeStyle).setLine(xoffset,yoffset , getWidth()-xoffset, getHeight()-yoffset);
        return ShapeStyle;
    }

    @Override
    public void setShapeStyle(Shape value) {
        ShapeStyle=value;
    }

    @Override
    void InitShapeStyle() {
        ShapeStyle=new Line2D.Float();
    }
    
    
    
    
}
