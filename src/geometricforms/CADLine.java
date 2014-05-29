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
        ((Line2D)ShapeStyle).setLine(1*LineThickness, 1*LineThickness, getWidth()-2*LineThickness, getHeight()-2*LineThickness);
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
