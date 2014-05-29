/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricforms;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Daxx
 */
public class CADRectangle extends CADShape{
    
    
    
    
    public CADRectangle() {
		// TODO Auto-generated constructor stub
	}

	public CADRectangle(Point Koord) {
		super(Koord);
		// TODO Auto-generated constructor stub
				
	}
	
	public CADRectangle(Rectangle Frame){
		
		super(Frame);
		
	}
        
        public CADRectangle(CADShape copy){
		
		super(copy);
		
	}      

    @Override
    public Shape getShapeStyle() {
        ((Rectangle2D)ShapeStyle).setRect(0.5*LineThickness, 0.5*LineThickness, getWidth()-LineThickness, getHeight()-LineThickness);       
        return ShapeStyle;
    }

    @Override
    public void setShapeStyle(Shape value) {
        ShapeStyle=value;
    }

    @Override
    void InitShapeStyle() {
        ShapeStyle=new Rectangle2D.Float();
    }
    
}
