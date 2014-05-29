/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricforms;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Daxx
 */
public class CADEllipse extends CADShape {
    
    
    public CADEllipse() {
		// TODO Auto-generated constructor stub
	}

	public CADEllipse(Point Koord) {
		super(Koord);
		// TODO Auto-generated constructor stub
	}

	public CADEllipse(Rectangle Frame) {
		super(Frame);
		// TODO Auto-generated constructor stub
	}
        
        public CADEllipse(CADShape copy){
		
		super(copy);
		
	}


    @Override
    public Shape getShapeStyle() {
        ((Arc2D)ShapeStyle).setArc(0.5*LineThickness, 0.5*LineThickness, getWidth()-LineThickness, getHeight()-LineThickness, 0, 360, 1);
        return ShapeStyle;
    }

    @Override
    public void setShapeStyle(Shape value) {
        ShapeStyle=value;
    }

    @Override
    void InitShapeStyle() {
        ShapeStyle=new Arc2D.Float();
    }
    
}
