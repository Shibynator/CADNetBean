/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadnetbean;

import geometricforms.CADShape;

/**
 *
 * @author Bruno
 */
public class SetCoordinates extends javax.swing.JFrame {
    CADShape Form;
    /**
     * Creates new form SetCoordinates
     */
    public SetCoordinates(CADShape Form) {
        this.Form = Form;
        
        initComponents();
        SetColumns();
        GetCoordinate(Form);
        
    }
    
    public void SetColumns(){
        XCoord.setColumns(11);
        YCoord.setColumns(11);
        Length.setColumns(11);
        Width.setColumns(11);
    }
    
    public void GetCoordinate(CADShape Form){
        XCoord.setText(new String(Integer.toString(Form.getX())));
        YCoord.setText(new String(Integer.toString(Form.getY())));
        Length.setText(new String(Integer.toString(Form.getWidth())));
        Width.setText(new String(Integer.toString(Form.getHeight())));
    }
    
    public void SetCoordinate(CADShape Form){
        Form.setLocation(new Integer(XCoord.getText()), new Integer(YCoord.getText()));
        Form.setSize(new Integer(Length.getText()), new Integer(Width.getText()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonAccept = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        XCoord = new javax.swing.JTextField();
        YCoord = new javax.swing.JTextField();
        TextX = new javax.swing.JTextField();
        TextY = new javax.swing.JTextField();
        Length = new javax.swing.JTextField();
        Width = new javax.swing.JTextField();
        TextL = new javax.swing.JTextField();
        TextH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("set coordinates");
        setAlwaysOnTop(true);
        setName("SetCoordinates"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        ButtonAccept.setText("Accept");
        ButtonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAcceptActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Cancel");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        XCoord.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        XCoord.setText("jTextField1");
        XCoord.setFocusable(false);
        XCoord.setMaximumSize(new java.awt.Dimension(59, 20));
        XCoord.setMinimumSize(new java.awt.Dimension(59, 20));
        XCoord.setRequestFocusEnabled(false);

        YCoord.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        YCoord.setText("jTextField4");
        YCoord.setFocusable(false);
        YCoord.setMaximumSize(new java.awt.Dimension(59, 20));
        YCoord.setMinimumSize(new java.awt.Dimension(59, 20));
        YCoord.setRequestFocusEnabled(false);

        TextX.setEditable(false);
        TextX.setText("X:");
        TextX.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextX.setRequestFocusEnabled(false);

        TextY.setEditable(false);
        TextY.setText("Y:");
        TextY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Length.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Length.setText("jTextField1");
        Length.setFocusable(false);
        Length.setMaximumSize(new java.awt.Dimension(59, 20));
        Length.setMinimumSize(new java.awt.Dimension(59, 20));
        Length.setRequestFocusEnabled(false);

        Width.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Width.setText("jTextField2");
        Width.setFocusable(false);
        Width.setMaximumSize(new java.awt.Dimension(59, 20));
        Width.setMinimumSize(new java.awt.Dimension(59, 20));
        Width.setRequestFocusEnabled(false);

        TextL.setEditable(false);
        TextL.setText("L:");
        TextL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextL.setPreferredSize(new java.awt.Dimension(16, 20));

        TextH.setEditable(false);
        TextH.setText("H:");
        TextH.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextH.setPreferredSize(new java.awt.Dimension(16, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Length, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextX, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(XCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonAccept, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextY, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Width, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonCancel, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Length, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Width, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAccept)
                    .addComponent(ButtonCancel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAcceptActionPerformed
        SetCoordinate(Form);
        setVisible(false);
    }//GEN-LAST:event_ButtonAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAccept;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JTextField Length;
    private javax.swing.JTextField TextH;
    private javax.swing.JTextField TextL;
    private javax.swing.JTextField TextX;
    private javax.swing.JTextField TextY;
    private javax.swing.JTextField Width;
    private javax.swing.JTextField XCoord;
    private javax.swing.JTextField YCoord;
    // End of variables declaration//GEN-END:variables
}