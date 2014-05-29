/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadnetbean;

import geometricforms.CADShape;
import java.beans.PropertyChangeListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Bruno
 */
public class SaveLoad implements Serializable {
    public String FileName;

    public void savefile(List<CADShape> data, boolean SaveAs) {
        if ((MainView.Saved == false) || (SaveAs==true)) {
            JFileChooser SAVE = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(".cad files", "cad");
            SAVE.setFileFilter(filter);
            SAVE.setDialogTitle("Speichern unter ...");
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
