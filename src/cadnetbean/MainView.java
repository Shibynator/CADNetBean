/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadnetbean;

/**
 *
 * @author Daxx
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolBar = new javax.swing.JToolBar();
        LineButton = new javax.swing.JToggleButton();
        ArrowButton = new javax.swing.JToggleButton();
        RectangleButton = new javax.swing.JToggleButton();
        SquareButton = new javax.swing.JToggleButton();
        EllipseButton = new javax.swing.JToggleButton();
        CircleButton = new javax.swing.JToggleButton();
        ScrollPane = new javax.swing.JScrollPane();
        PaintPanel = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuItemOpen = new javax.swing.JMenuItem();
        MenuItemSave = new javax.swing.JMenuItem();
        MenuItemPrint = new javax.swing.JMenuItem();
        MenuItemClose = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        MenuView = new javax.swing.JMenu();
        CheckBoxToolBar = new javax.swing.JCheckBoxMenuItem();
        CheckBoxGrid = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAD by ZjoeFeu");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("MainView"); // NOI18N

        ToolBar.setFloatable(false);
        ToolBar.setRollover(true);

        LineButton.setText("L");
        LineButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LineButton.setFocusable(false);
        LineButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LineButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        LineButton.setMaximumSize(new java.awt.Dimension(20, 20));
        LineButton.setMinimumSize(new java.awt.Dimension(20, 20));
        LineButton.setPreferredSize(new java.awt.Dimension(20, 20));
        LineButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineButtonMouseClicked(evt);
            }
        });
        ToolBar.add(LineButton);

        ArrowButton.setText("A");
        ArrowButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ArrowButton.setFocusable(false);
        ArrowButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ArrowButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ArrowButton.setMaximumSize(new java.awt.Dimension(20, 20));
        ArrowButton.setMinimumSize(new java.awt.Dimension(20, 20));
        ArrowButton.setPreferredSize(new java.awt.Dimension(20, 20));
        ArrowButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ArrowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArrowButtonMouseClicked(evt);
            }
        });
        ToolBar.add(ArrowButton);

        RectangleButton.setText("R");
        RectangleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RectangleButton.setFocusable(false);
        RectangleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RectangleButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        RectangleButton.setMaximumSize(new java.awt.Dimension(20, 20));
        RectangleButton.setMinimumSize(new java.awt.Dimension(20, 20));
        RectangleButton.setPreferredSize(new java.awt.Dimension(20, 20));
        RectangleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RectangleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RectangleButtonMouseClicked(evt);
            }
        });
        ToolBar.add(RectangleButton);

        SquareButton.setText("S");
        SquareButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SquareButton.setFocusable(false);
        SquareButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SquareButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        SquareButton.setMaximumSize(new java.awt.Dimension(20, 20));
        SquareButton.setMinimumSize(new java.awt.Dimension(20, 20));
        SquareButton.setPreferredSize(new java.awt.Dimension(20, 20));
        SquareButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SquareButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SquareButtonMouseClicked(evt);
            }
        });
        ToolBar.add(SquareButton);

        EllipseButton.setText("E");
        EllipseButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EllipseButton.setFocusable(false);
        EllipseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EllipseButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        EllipseButton.setMaximumSize(new java.awt.Dimension(20, 20));
        EllipseButton.setMinimumSize(new java.awt.Dimension(20, 20));
        EllipseButton.setPreferredSize(new java.awt.Dimension(20, 20));
        EllipseButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EllipseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EllipseButtonMouseClicked(evt);
            }
        });
        ToolBar.add(EllipseButton);

        CircleButton.setText("C");
        CircleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CircleButton.setFocusable(false);
        CircleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CircleButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        CircleButton.setMaximumSize(new java.awt.Dimension(20, 20));
        CircleButton.setMinimumSize(new java.awt.Dimension(20, 20));
        CircleButton.setPreferredSize(new java.awt.Dimension(20, 20));
        CircleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CircleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CircleButtonMouseClicked(evt);
            }
        });
        ToolBar.add(CircleButton);

        ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        PaintPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaintPanelLayout = new javax.swing.GroupLayout(PaintPanel);
        PaintPanel.setLayout(PaintPanelLayout);
        PaintPanelLayout.setHorizontalGroup(
            PaintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        PaintPanelLayout.setVerticalGroup(
            PaintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        ScrollPane.setViewportView(PaintPanel);

        MenuBar.setAlignmentY(0.5F);

        MenuFile.setText("File");

        MenuItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemOpen.setText("open");
        MenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemOpenActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemOpen);

        MenuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemSave.setText("save");
        MenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSaveActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemSave);

        MenuItemPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemPrint.setText("print");
        MenuItemPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPrintActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemPrint);

        MenuItemClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemClose.setText("Close");
        MenuFile.add(MenuItemClose);

        MenuBar.add(MenuFile);

        MenuEdit.setText("Edit");
        MenuBar.add(MenuEdit);

        MenuView.setText("View");

        CheckBoxToolBar.setSelected(true);
        CheckBoxToolBar.setText("Toolbar");
        CheckBoxToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxToolBarActionPerformed(evt);
            }
        });
        MenuView.add(CheckBoxToolBar);

        CheckBoxGrid.setSelected(true);
        CheckBoxGrid.setText("Grid");
        CheckBoxGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGridActionPerformed(evt);
            }
        });
        MenuView.add(CheckBoxGrid);

        MenuBar.add(MenuView);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemPrintActionPerformed

    private void MenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemOpenActionPerformed

    private void MenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemSaveActionPerformed

    private void CheckBoxToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxToolBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxToolBarActionPerformed

    private void CheckBoxGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxGridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxGridActionPerformed

    private void ArrowButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArrowButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrowButtonMouseClicked

    private void LineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LineButtonMouseClicked

    private void RectangleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RectangleButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RectangleButtonMouseClicked

    private void SquareButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SquareButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SquareButtonMouseClicked

    private void EllipseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EllipseButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EllipseButtonMouseClicked

    private void CircleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CircleButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CircleButtonMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ArrowButton;
    private javax.swing.JCheckBoxMenuItem CheckBoxGrid;
    private javax.swing.JCheckBoxMenuItem CheckBoxToolBar;
    private javax.swing.JToggleButton CircleButton;
    private javax.swing.JToggleButton EllipseButton;
    private javax.swing.JToggleButton LineButton;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenuItem MenuItemClose;
    private javax.swing.JMenuItem MenuItemOpen;
    private javax.swing.JMenuItem MenuItemPrint;
    private javax.swing.JMenuItem MenuItemSave;
    private javax.swing.JMenu MenuView;
    private javax.swing.JPanel PaintPanel;
    private javax.swing.JToggleButton RectangleButton;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JToggleButton SquareButton;
    private javax.swing.JToolBar ToolBar;
    // End of variables declaration//GEN-END:variables
}
