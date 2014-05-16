/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricforms;

import java.awt.Graphics;
import java.awt.Point;

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
    
    
    
    
}
