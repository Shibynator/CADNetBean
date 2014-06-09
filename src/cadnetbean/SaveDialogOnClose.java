/**
 * *****************************************************************************
 * Class:	SaveDialogOnClose.java
 * *****************************************************************************
 * Company:	Berner Fachhochschule für Technik und Informatik
 *
 * Author:	Feuz Bruno
 *
 * Datum:       20.05.2014
 *
 * Project:	CADNetBean
 *
 * Describtion:	Definition des Popupfensters, welches beim schliessen des 
 *              Hauptfensters aufgerufen wird, wenn die Zeichnung nicht 
 *              gespeichert wurde.
 *              Nutzer kann entscheiden, ob er speichern möchte oder nicht.
 *
 * Revision:	0.0	file created 
 *              0.1     modified	FB 20.05.2014
 *              1.0     final release   FB 09.06.2104
 * *****************************************************************************
 */

// Package dfinition
package cadnetbean;

// Importiert Packages und Bibliotheken
import javax.swing.JOptionPane;


public class SaveDialogOnClose {
    // Attributes
    int Option;    // Hilfsattribut, liefert den Wert des gedrückten Knopfes    
    String Title = "File not saved";    // Titel des Popupfensters
    // Angezeigter Warntext
    String Message = "File not saved. Would you like to save befor close?";
    
    SaveDialogOnClose(){
        
        Option = JOptionPane.showOptionDialog(null, Message, Title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null, Title);
    }
}
