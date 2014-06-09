/*******************************************************************************
 * Class:	ToolBarButtonGroup.java
 *******************************************************************************
 * Company:	Berner Fachhochschule für Technik und Informatik
 * 
 * Author:	Feuz Bruno (FB)
 * 
 * Datum:       06.05.2014
 * 
 * Project:	CADNetBean
 * 
 * Describtion:	Unterklasse der Klasse ButtonGroup.
 *              Stellt sicher, dass immer nur ein Button der Gruppe selektiert
 *              ist. Sorgt dafür, dass immer ein Button aktiviert ist.
 *
 * Revision:	0.0	file created
 *              0.1     modified	FB  06.05.2014
 *              1.0     final release   FB  09.06.2014
 ******************************************************************************/

// package definition
package cadnetbean;

// importiert packages und Bibliotheken
import javax.swing.ButtonModel;

public class ToolBarButtonGroup extends javax.swing.ButtonGroup {
    
    @Override
    public void setSelected(ButtonModel model, boolean selected) {
        if (selected) {
            super.setSelected(model, selected);
        } else {
            //clearSelection();
            //super.setSelected(model, selected);
        }
    }
}
