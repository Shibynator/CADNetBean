/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadnetbean;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class SaveDialogOnClose {
    int Option;
    String Title = "File not saved";
    String Message = "File not saved. Would you like to save befor close?";
    
    SaveDialogOnClose(){
        //JOptionPane.showMessageDialog(null, Message, Title, JOptionPane.OK_CANCEL_OPTION);
        Option = JOptionPane.showOptionDialog(null, Message, Title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, Title);
    }
}
