/**
 * *****************************************************************************
 * Class:	SaveLoad.java
 * *****************************************************************************
 * Company:	Berner Fachhochschule für Technik und Informatik
 *
 * Author:	Feuz Bruno
 *
 * Datum:       30.05.2014
 *
 * Project:	CADNetBean
 *
 * Describtion:	Beinhaltet die Methoden zum abspeichern der Zeichnung.
 *              Methoden wurden aus den Handouts von Herrn Krucker übernommen
 *
 * Revision:	0.0	file created 
 *              0.1     modified	FB 30.05.2014
 *              1.0     final release   FB 09.06.2104
 * *****************************************************************************
 */

// package definition
package cadnetbean;

// importiert packages und Bibliotheken
import geometricforms.CADShape;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class SaveLoad implements Serializable {
    
    // Attribut 
    public String FileName;     // Name des Files zum abspeichern

    /*
    * Methode zum speichern der Zeichnung. 
    * Überprüft, ob die Zeichnung schon einmal abgespeichert wurde oder ob die
    * Option "save as..." gedrückt wurde.
    * Wenn nicht gespeichert oder "save as.." Popupfenster "Speichern unter..."
    * aufrufen. Neue Datei wird erzeugt.
    * Wenn Datei schon einmal gespeichert, alte Version überschreiben.
    * Warnung ausgeben, wenn File nicht gespeichert werden konnte
    */
    public void savefile(List<CADShape> data, boolean SaveAs) {
        if ((MainView.Saved == false) || (SaveAs==true)) {
            JFileChooser SAVE = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(".cad files", "cad");
            SAVE.setFileFilter(filter);
            SAVE.setDialogTitle("Save as ...");
            SAVE.setDialogType(JFileChooser.SAVE_DIALOG);
            int returnVal = SAVE.showSaveDialog(null); // Dialog an Parent-Window anhaengen 
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("Ihre Wahl zum Speichern: " + SAVE.getSelectedFile().getName());
            }
           FileName = SAVE.getSelectedFile().getAbsolutePath();
            try {
                saveToFile(SAVE.getSelectedFile().getAbsolutePath(), data);
                MainView.Save = true;
                MainView.Saved = true;
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Datei konnte nicht gespeichert werden", "File not saved", JOptionPane.OK_CANCEL_OPTION);
            }
        } else {
            try {
                saveToFile(FileName, data);
                MainView.Save = true;
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Datei konnte nicht gespeichert werden", "File not saved", JOptionPane.OK_CANCEL_OPTION);
            }
        }
    }

    /*
     * Aus Handout "Serialisierung in JAVA" von G.Krucker übernommen
     * Schreibt die zu speichernde Arrayliste in das File
     */
    public void saveToFile(String filename, List<CADShape> data) throws IOException {
        // Ausschreiben der Liste in das File 
        FileOutputStream file = new FileOutputStream(filename);
        try (ObjectOutputStream OutputStream = new ObjectOutputStream(file)) {
            OutputStream.writeObject(data);
            OutputStream.flush();
        }
    }
}
