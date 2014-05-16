/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricforms;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

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
	public void paint(Graphics g) {

		g.drawOval(0, 0, getWidth()-1, getHeight()-1);
                super.paint(g);
	}
    
}
