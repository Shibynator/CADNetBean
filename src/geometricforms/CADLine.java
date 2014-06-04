/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricforms;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Daxx
 */

public class CADLine extends CADShape{
    
    public boolean Mirroring=false;
    
    public CADLine(){       
    }
    
    public CADLine(Point Koord){
        super(Koord);
    }
    
    public CADLine(CADShape copy){
	super(copy);	
    }

    @Override
    public Shape getShapeStyle() {
               
        if(Mirroring)
            ((Line2D)ShapeStyle).setLine(getWidth(),0 , 0, getHeight());
        else
            ((Line2D)ShapeStyle).setLine(0,0 , getWidth(), getHeight());
        
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
