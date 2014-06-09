/**
 * *****************************************************************************
 * Class:	CADNetBean.java
 * *****************************************************************************
 * Company:	Berner Fachhochschule für Technik und Informatik
 *
 * Author:	Daniel Ziörjen, Bruno Feuz
 *
 * Datum: 04.06.2014
 *
 * Project:	CADNetBean
 *
 * Describtion:	
 * Diese Klasse beeinhaltet lediglich die Main-Methode in welcher das MainView 
 * instanziert wird.
 * 
 * ******************************************************************************
 */

package cadnetbean;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CADNetBean {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MainView().setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(CADNetBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
