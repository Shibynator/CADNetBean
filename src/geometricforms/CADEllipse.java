/**
 * *****************************************************************************
 * Class:	CADEllipse.java
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
 * Diese Klasse erstellt ein  Jpanel in welchem eine Ellipse gezeichnet
 * wird. Alle Haupt-Funktionalitäten erbt sie von der Klasse CADShape.
 * Aufgabe dieser Klasse ist es den korrekten ShapeStyle zu setzen damit die
 * Oberklasse auch wirklich eine Ellipse zeichnet.
 * 
 * ******************************************************************************
 */

package geometricforms;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;

public class CADEllipse extends CADShape {
    
    
    public CADEllipse() {
    }

    public CADEllipse(Point Koord) {
        super(Koord);
    }

    public CADEllipse(Rectangle Frame) {
        super(Frame);
    }
        
    public CADEllipse(CADShape copy) {
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
