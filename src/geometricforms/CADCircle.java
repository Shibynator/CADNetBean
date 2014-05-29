/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricforms;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Daxx
 */
public class CADCircle extends CADEllipse {
    
    public CADCircle() {
		// TODO Auto-generated constructor stub
	}

	public CADCircle(Point Koord) {
		super(Koord);
		// TODO Auto-generated constructor stub
	}

	public CADCircle(Rectangle Frame) {
		super(Frame);
		// TODO Auto-generated constructor stub
	}
        
        public CADCircle(CADShape copy){
		
		super(copy);
		
	}

	
	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, height, height);
	}

    
    
}
