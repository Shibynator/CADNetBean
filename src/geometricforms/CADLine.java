/**
 * *****************************************************************************
 * Class:	CADLine.java
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
 * Diese Klasse erstellt ein  Jpanel in welchem eine Linie gezeichnet
 * wird. Alle Haupt-Funktionalitäten erbt sie von der Klasse CADShape.
 * Aufgabe dieser Klasse ist es den korrekten ShapeStyle zu setzen damit die
 * Oberklasse auch wirklich eine Linie zeichnet.
 * 
 * ******************************************************************************
 */

package geometricforms;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;

/**
 *
 * @author Daxx
 */

public class CADLine extends CADShape{
    
    public boolean Mirroring=false;
    
    public CADLine(){       
    }
    
    public CADLine(Point Koord){
        super(Koord);
    }
    
    public CADLine(CADShape copy){
	super(copy);	
    }

    @Override
    public Shape getShapeStyle() {
               
        if(Mirroring)
            ((Line2D)ShapeStyle).setLine(getWidth(),0 , 0, getHeight());
        else
            ((Line2D)ShapeStyle).setLine(0,0 , getWidth(), getHeight());
        
        return ShapeStyle;
    }

    @Override
    public void setShapeStyle(Shape value) {
        ShapeStyle=value;
    }

    @Override
    void InitShapeStyle() {
        ShapeStyle=new Line2D.Float();
    }  
}
