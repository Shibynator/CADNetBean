/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadnetbean;

import javax.swing.*;
/**
 *
 * @author Bruno
 */
public class KontextMenu extends JPopupMenu{
    public JMenuItem test = new JMenuItem();
    
    public KontextMenu(){
        this.setVisible(true);
        this.add(test);
    }
    
}
