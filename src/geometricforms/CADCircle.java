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
public class CADCircle extends CADEllipse {
    
    public CADCircle() {
    }

    public CADCircle(Point Koord) {
        super(Koord);
    }

    public CADCircle(Rectangle Frame) {
        super(Frame);
    }

    public CADCircle(CADShape copy) {
        super(copy);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, height, height);
    }

    
    
}
