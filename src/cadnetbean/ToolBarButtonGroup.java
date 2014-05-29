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
 * Describtion:	Subclass of Class "ButtonGroup"
 *              Makes sure, that only one button in the group can be selected.
 *
 * Revision:	0.0	file created
 *              0.1     modified	FB  06.05.2014
 ******************************************************************************/

package cadnetbean;

import javax.swing.ButtonModel;

public class ToolBarButtonGroup extends javax.swing.ButtonGroup {
    
    @Override
    public void setSelected(ButtonModel model, boolean selected) {
        if (selected) {
            super.setSelected(model, selected);
        } else {
            clearSelection();
            //super.setSelected(model, selected);
        }
    }
}
