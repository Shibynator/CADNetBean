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
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
                
                if(IsFilled){
            
                    g.setColor(FillColor);
                    g.fillRect(0, 0, getWidth()-1, getHeight()-1);
            
                }
		g.setColor(DrawColor);
		g.drawRect(0, 0, getWidth()-1, getHeight()-1);

		
	}
    
}
