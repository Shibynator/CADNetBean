/**
 * *****************************************************************************
 * Class:	CADRectangle.java
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
 * Diese Klasse erstellt ein  Jpanel in welchem ein Rechteck gezeichnet
 * wird. Alle Haupt-Funktionalitäten erbt sie von der Klasse CADShape.
 * Aufgabe dieser Klasse ist es den korrekten ShapeStyle zu setzen damit die
 * Oberklasse auch wirklich ein Rechteck zeichnet.
 * 
 * ******************************************************************************
 */

package geometricforms;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Daxx
 */
public class CADRectangle extends CADShape{

    public CADRectangle() {
    }

    public CADRectangle(Point Koord) {
        super(Koord);
    }

    public CADRectangle(Rectangle Frame) {
        super(Frame);
    }

    public CADRectangle(CADShape copy) {
        super(copy);
    }  

    @Override
    public Shape getShapeStyle() {
        ((Rectangle2D)ShapeStyle).setRect(0.5*LineThickness, 0.5*LineThickness, getWidth()-LineThickness, getHeight()-LineThickness);       
        return ShapeStyle;
    }

    @Override
    public void setShapeStyle(Shape value) {
        ShapeStyle=value;
    }

    @Override
    void InitShapeStyle() {
        ShapeStyle=new Rectangle2D.Float();
    }
    
}
