/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadnetbean;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daxx
 */
public class CADNetBean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
