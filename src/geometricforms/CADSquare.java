/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricforms;

import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author Daxx
 */
public class CADSquare extends CADRectangle {
    
    public CADSquare() {
		// TODO Auto-generated constructor stub
	}

	public CADSquare(Point Koord) {
		super(Koord);
		// TODO Auto-generated constructor stub
	}

	public CADSquare(Rectangle Frame) {
		super(Frame);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, height, height);
	}
    
    
    
}
