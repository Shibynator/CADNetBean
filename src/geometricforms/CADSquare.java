/**
 * *****************************************************************************
 * Class:	CADSquare.java
 * *****************************************************************************
 * Company:	Berner Fachhochschule für Technik und Informatik
 *
 * Author:	Daniel Ziörjen
 *
 * Datum: 04.06.2014
 *
 * Project:	CADNetBean
 *
 * Describtion:	
 * Diese Klasse erstellt ein  Jpanel in welchem ein Quadrat gezeichnet
 * wird. Alle Haupt-Funktionalitäten erbt sie von der Klasse CADShape.
 * Aufgabe dieser Klasse ist es den korrekten ShapeStyle zu setzen damit die
 * Oberklasse auch wirklich ein Quadrat zeichnet.
 * 
 * ******************************************************************************
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
    }

    public CADSquare(Point Koord) {
        super(Koord);
    }

    public CADSquare(Rectangle Frame) {
        super(Frame);
    }

    public CADSquare(CADShape copy) {
        super(copy);
    }

	@Override
	public void setBounds(int x, int y, int width, int height) {
		super.setBounds(x, y, height, height);
	}  
}
