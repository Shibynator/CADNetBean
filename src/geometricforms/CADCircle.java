/**
 * *****************************************************************************
 * Class:	CADCircle.java
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
 * Diese Klasse erstellt ein quadratisches Jpanel in welchem ein Kreis gezeichnet
 * wird. Zu diesem Zweck wird nur die setbounds-Methode überschritten.
 * Alle anderen Funktionalitäten erbt sie von der Klasse CADShape.
 * Zukünftige Kreis-spezifische Features können ohne Probleme implementiert werden.
 * 
 * ******************************************************************************
 */

package geometricforms;

import java.awt.Point;
import java.awt.Rectangle;

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
