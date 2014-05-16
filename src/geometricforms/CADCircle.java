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
public class CADCircle extends CADShape {
    
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
	public void paint(Graphics g) {

		g.drawArc(0, 0, getWidth()-1, getHeight()-1, 0, 360);
                super.paint(g);
	}
	
	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, height, height);
	}
    
}
