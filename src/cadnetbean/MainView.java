/*******************************************************************************
 * Class:	MainView.java
 *******************************************************************************
 * Company:	Berner Fachhochschule für Technik und Informatik
 * 
 * Author:	Feuz Bruno (FB)
 * 
 * Datum:       06.05.2014
 * 
 * Project:	CADNetBean
 * 
 * Describtion:	Defines the Mainframe-Designe of the CAD.
 *
 * Revision:	0.0	file created
 *              0.1     modified	FB  06.05.2014
 ******************************************************************************/

// Package definition
package cadnetbean;

// Import packages and libraries
import geometricforms.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.print.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainView extends javax.swing.JFrame implements Serializable{
 
    // Attributs
    private static final long serialVersionUID = 1L;
    private List<CADShape>GraphicList= new ArrayList<CADShape>();
    private CADShape ShapeStyle;
    private CADShape CopyBuffer;
    private Point FirstClick=new Point();
    private boolean Saved = false;
    ToolBarButtonGroup ToolBarButtons = new ToolBarButtonGroup();
    
    private PropertyChangeListener ShapePropertyListener = new PropertyChangeListener() {
        public void propertyChange(PropertyChangeEvent arg0) {
            Object sourceObject = arg0.getSource();

            if (sourceObject instanceof CADShape) {

                if (arg0.getPropertyName().equals("Selected")) {

                    if((Boolean)arg0.getNewValue()!=false){
                        
                        for (CADShape item : GraphicList) {
                            if(item!=sourceObject){
                                item.setSelected(false);
                            }
                        }
                        ((CADShape) sourceObject).setBackground(Color.green);//TODO: nur zum testselektieren    
                    }
                    else{
                        ((CADShape) sourceObject).setOpaque(false);
                        ((CADShape) sourceObject).setBackground(Color.white);
                    }
                        
                    
                    }
                }
            }
        };
    
    // Creates Frame of MainView
    public MainView() {
	setBounds(100, 100, 500, 400); // Minimale Fenstergrösse
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);	// Beim Programmstart automatisch in Vollbildmodus
	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        ReservePanel = new javax.swing.JPanel();
        FillColorButton = new javax.swing.JButton();
        FillColorPanel = new javax.swing.JPanel();
        LineColorButton = new javax.swing.JButton();
        LineColorPanel = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        PaintPanel = new javax.swing.JLayeredPane();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuItemOpen = new javax.swing.JMenuItem();
        MenuItemSave = new javax.swing.JMenuItem();
        MenuItemPrint = new javax.swing.JMenuItem();
        MenuItemClose = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        MenuItemCopy = new javax.swing.JMenuItem();
        MenuItemPaste = new javax.swing.JMenuItem();
        MenuItemDelet = new javax.swing.JMenuItem();
        MenuView = new javax.swing.JMenu();
        CheckBoxToolBar = new javax.swing.JCheckBoxMenuItem();
        CheckBoxGrid = new javax.swing.JCheckBoxMenuItem();
        MenuItemBackgroundcolor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAD by ZjoeFeu");
        setBackground(java.awt.SystemColor.activeCaption);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("MainView"); // NOI18N

        ToolBar.setFloatable(false);
        ToolBar.setRollover(true);
        ToolBar.setMaximumSize(new java.awt.Dimension(142, 42));
        ToolBar.setMinimumSize(new java.awt.Dimension(142, 42));
        ToolBar.setPreferredSize(new java.awt.Dimension(142, 42));

        ToolBarButtons.add(LineButton);
        LineButton.setText("L");
        LineButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LineButton.setFocusable(false);
        LineButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LineButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        LineButton.setMaximumSize(new java.awt.Dimension(40, 40));
        LineButton.setMinimumSize(new java.awt.Dimension(20, 20));
        LineButton.setPreferredSize(new java.awt.Dimension(40, 40));
        LineButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineButtonMouseClicked(evt);
            }
        });
        ToolBar.add(LineButton);

        ToolBarButtons.add(ArrowButton);
        ArrowButton.setText("A");
        ArrowButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ArrowButton.setFocusable(false);
        ArrowButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ArrowButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ArrowButton.setMaximumSize(new java.awt.Dimension(40, 40));
        ArrowButton.setMinimumSize(new java.awt.Dimension(40, 40));
        ArrowButton.setPreferredSize(new java.awt.Dimension(40, 40));
        ArrowButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ArrowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArrowButtonMouseClicked(evt);
            }
        });
        ToolBar.add(ArrowButton);

        ToolBarButtons.add(RectangleButton);
        RectangleButton.setText("R");
        RectangleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RectangleButton.setFocusable(false);
        RectangleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RectangleButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        RectangleButton.setMaximumSize(new java.awt.Dimension(40, 40));
        RectangleButton.setMinimumSize(new java.awt.Dimension(40, 40));
        RectangleButton.setPreferredSize(new java.awt.Dimension(40, 40));
        RectangleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RectangleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RectangleButtonMouseClicked(evt);
            }
        });
        ToolBar.add(RectangleButton);

        ToolBarButtons.add(SquareButton);
        SquareButton.setText("S");
        SquareButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SquareButton.setFocusable(false);
        SquareButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SquareButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        SquareButton.setMaximumSize(new java.awt.Dimension(40, 40));
        SquareButton.setMinimumSize(new java.awt.Dimension(40, 40));
        SquareButton.setPreferredSize(new java.awt.Dimension(40, 40));
        SquareButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SquareButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SquareButtonMouseClicked(evt);
            }
        });
        ToolBar.add(SquareButton);

        ToolBarButtons.add(EllipseButton);
        EllipseButton.setText("E");
        EllipseButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EllipseButton.setFocusable(false);
        EllipseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EllipseButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        EllipseButton.setMaximumSize(new java.awt.Dimension(40, 40));
        EllipseButton.setMinimumSize(new java.awt.Dimension(40, 40));
        EllipseButton.setPreferredSize(new java.awt.Dimension(40, 40));
        EllipseButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EllipseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EllipseButtonMouseClicked(evt);
            }
        });
        ToolBar.add(EllipseButton);

        ToolBarButtons.add(CircleButton);
        CircleButton.setText("C");
        CircleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CircleButton.setFocusable(false);
        CircleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CircleButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        CircleButton.setMaximumSize(new java.awt.Dimension(40, 40));
        CircleButton.setMinimumSize(new java.awt.Dimension(40, 40));
        CircleButton.setPreferredSize(new java.awt.Dimension(40, 40));
        CircleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CircleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CircleButtonMouseClicked(evt);
            }
        });
        ToolBar.add(CircleButton);

        ReservePanel.setMaximumSize(new java.awt.Dimension(40, 40));
        ReservePanel.setMinimumSize(new java.awt.Dimension(40, 40));
        ReservePanel.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout ReservePanelLayout = new javax.swing.GroupLayout(ReservePanel);
        ReservePanel.setLayout(ReservePanelLayout);
        ReservePanelLayout.setHorizontalGroup(
            ReservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        ReservePanelLayout.setVerticalGroup(
            ReservePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        ToolBar.add(ReservePanel);

        FillColorButton.setText("FillC");
        FillColorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FillColorButton.setFocusable(false);
        FillColorButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FillColorButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        FillColorButton.setMaximumSize(new java.awt.Dimension(40, 40));
        FillColorButton.setMinimumSize(new java.awt.Dimension(40, 40));
        FillColorButton.setPreferredSize(new java.awt.Dimension(40, 40));
        FillColorButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FillColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillColorButtonActionPerformed(evt);
            }
        });
        ToolBar.add(FillColorButton);

        FillColorPanel.setBackground(new java.awt.Color(255, 255, 255));
        FillColorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        FillColorPanel.setMaximumSize(new java.awt.Dimension(40, 40));
        FillColorPanel.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout FillColorPanelLayout = new javax.swing.GroupLayout(FillColorPanel);
        FillColorPanel.setLayout(FillColorPanelLayout);
        FillColorPanelLayout.setHorizontalGroup(
            FillColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        FillColorPanelLayout.setVerticalGroup(
            FillColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        ToolBar.add(FillColorPanel);

        LineColorButton.setText("LineC");
        LineColorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LineColorButton.setFocusable(false);
        LineColorButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LineColorButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        LineColorButton.setMaximumSize(new java.awt.Dimension(40, 40));
        LineColorButton.setMinimumSize(new java.awt.Dimension(40, 40));
        LineColorButton.setPreferredSize(new java.awt.Dimension(40, 40));
        LineColorButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LineColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineColorButtonActionPerformed(evt);
            }
        });
        ToolBar.add(LineColorButton);

        LineColorPanel.setBackground(new java.awt.Color(255, 255, 255));
        LineColorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LineColorPanel.setMaximumSize(new java.awt.Dimension(40, 40));
        LineColorPanel.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout LineColorPanelLayout = new javax.swing.GroupLayout(LineColorPanel);
        LineColorPanel.setLayout(LineColorPanelLayout);
        LineColorPanelLayout.setHorizontalGroup(
            LineColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        LineColorPanelLayout.setVerticalGroup(
            LineColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        ToolBar.add(LineColorPanel);

        ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollPane.setAutoscrolls(true);

        PaintPanel.setBackground(java.awt.Color.white);
        PaintPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaintPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PaintPanelMousePressed(evt);
            }
        });
        PaintPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PaintPanelMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout PaintPanelLayout = new javax.swing.GroupLayout(PaintPanel);
        PaintPanel.setLayout(PaintPanelLayout);
        PaintPanelLayout.setHorizontalGroup(
            PaintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        PaintPanelLayout.setVerticalGroup(
            PaintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        ScrollPane.setViewportView(PaintPanel);

        MenuBar.setBackground(java.awt.SystemColor.activeCaption);
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
        MenuItemClose.setText("close");
        MenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCloseActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemClose);

        MenuBar.add(MenuFile);

        MenuEdit.setText("Edit");

        MenuItemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemCopy.setText("copy");
        MenuItemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCopyActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemCopy);

        MenuItemPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemPaste.setText("paste");
        MenuItemPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPasteActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemPaste);

        MenuItemDelet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        MenuItemDelet.setText("delet");
        MenuItemDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemDeletActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemDelet);

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

        CheckBoxGrid.setText("Grid");
        CheckBoxGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGridActionPerformed(evt);
            }
        });
        MenuView.add(CheckBoxGrid);

        MenuItemBackgroundcolor.setText("set Backgroundcolor");
        MenuItemBackgroundcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBackgroundcolorActionPerformed(evt);
            }
        });
        MenuView.add(MenuItemBackgroundcolor);

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
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPrintActionPerformed
        if (evt.getActionCommand().equals("print") == true) {
            
        }
    }//GEN-LAST:event_MenuItemPrintActionPerformed

    private void MenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemOpenActionPerformed
        if (evt.getActionCommand().equals("open") == true) {
            JFileChooser OPEN = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(".cad files", "cad");
            OPEN.setFileFilter(filter);
            OPEN.setDialogTitle("Öffnen...");
            OPEN.setDialogType(JFileChooser.OPEN_DIALOG); // Dialog zum Oeffnen
            int returnVal = OPEN.showOpenDialog(this); // Dialog an Parent-Window anhaengen 
            if (returnVal == JFileChooser.APPROVE_OPTION) System.out.println("Ihre Wahl zum öffnen: " + OPEN.getSelectedFile().getName());
            try {
                loadFromFile(OPEN.getSelectedFile().getAbsolutePath());
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();    // TODO Auto-generated catch block 
                JOptionPane.showMessageDialog(null, "Datei konnte nicht geöffnet werden", "File not found", JOptionPane.OK_CANCEL_OPTION);
            }
        }
    }//GEN-LAST:event_MenuItemOpenActionPerformed

    private void MenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveActionPerformed
        if (evt.getActionCommand().equals("save") == true) {
            JFileChooser SAVE = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(".cad files", "cad");
            SAVE.setFileFilter(filter);
            SAVE.setDialogTitle("Speichern unter ...");
            SAVE.setDialogType(JFileChooser.SAVE_DIALOG);
            int returnVal = SAVE.showSaveDialog(this); // Dialog an Parent-Window anhaengen 
            if (returnVal == JFileChooser.APPROVE_OPTION) System.out.println("Ihre Wahl zum Speichern: " + SAVE.getSelectedFile().getName());
            try {
                saveToFile(SAVE.getSelectedFile().getAbsolutePath());
                Saved = true;
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Datei konnte nicht gespeichert werden", "File not saved", JOptionPane.OK_CANCEL_OPTION);
            }
            
        }
    }//GEN-LAST:event_MenuItemSaveActionPerformed

    private void CheckBoxToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxToolBarActionPerformed
        if(CheckBoxToolBar.isSelected()==true){
            ToolBar.setVisible(true);
        } else {
            ToolBar.setVisible(false);
        }
    }//GEN-LAST:event_CheckBoxToolBarActionPerformed

    private void CheckBoxGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxGridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxGridActionPerformed

    private void ArrowButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArrowButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrowButtonMouseClicked

    private void LineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineButtonMouseClicked
        ShapeStyle=new CADLine();
        
    }//GEN-LAST:event_LineButtonMouseClicked

    private void RectangleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RectangleButtonMouseClicked
        ShapeStyle=new CADRectangle();
    }//GEN-LAST:event_RectangleButtonMouseClicked

    private void SquareButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SquareButtonMouseClicked
        ShapeStyle=new CADSquare();
    }//GEN-LAST:event_SquareButtonMouseClicked

    private void EllipseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EllipseButtonMouseClicked
        ShapeStyle=new CADEllipse();
    }//GEN-LAST:event_EllipseButtonMouseClicked

    private void CircleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CircleButtonMouseClicked
        ShapeStyle=new CADCircle();
    }//GEN-LAST:event_CircleButtonMouseClicked

    private void MenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCloseActionPerformed
        if (evt.getActionCommand().equals("close") == true) {
            if(Saved == true){
              System.exit(0);  
            }
            else{
               JOptionPane.showMessageDialog(null, "Datei ist nicht gespeichert", "File not saved", JOptionPane.OK_CANCEL_OPTION); 
            }
        }
    }//GEN-LAST:event_MenuItemCloseActionPerformed

    private void FillColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillColorButtonActionPerformed
        for (CADShape item : GraphicList) {
            if(item.getSelected()){
                 item.IsFilled=true;
                 item.FillColor = JColorChooser.showDialog(this, null, item.FillColor);
                 FillColorPanel.setBackground(item.FillColor);
            }
        }
    }//GEN-LAST:event_FillColorButtonActionPerformed

    private void PaintPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaintPanelMouseDragged
        if(evt.getX()-FirstClick.x>0&&evt.getY()-FirstClick.y>0)//positiv width and height
            GraphicList.get(GraphicList.size()-1).setBounds(FirstClick.x, FirstClick.y, evt.getX()-FirstClick.x, evt.getY()-FirstClick.y);				
        
        else if(evt.getX()-FirstClick.x<0&&evt.getY()-FirstClick.y>0)//negativ width and positiv height
            GraphicList.get(GraphicList.size()-1).setBounds(evt.getX(), FirstClick.y, FirstClick.x-evt.getX(), evt.getY()-FirstClick.y);	
        
        else if(evt.getX()-FirstClick.x>0&&evt.getY()-FirstClick.y<0)//positiv width and negativ height
            GraphicList.get(GraphicList.size()-1).setBounds(FirstClick.x, evt.getY(), evt.getX()-FirstClick.x, FirstClick.y-evt.getY());
        
        else if(evt.getX()-FirstClick.x<0&&evt.getY()-FirstClick.y<0)//negativ width and negativ height
            GraphicList.get(GraphicList.size()-1).setBounds(evt.getX(), evt.getY(), FirstClick.x-evt.getX(), FirstClick.y-evt.getY());
        
	GraphicList.get(GraphicList.size()-1).repaint();
    }//GEN-LAST:event_PaintPanelMouseDragged

    private void PaintPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaintPanelMouseClicked
        for (CADShape item : GraphicList) {

            item.setSelected(false);
//            item.setBackground(Color.white);//TODO: Hintergrundfarbe?
            item.setOpaque(false);
        }
    }//GEN-LAST:event_PaintPanelMouseClicked

    private void LineColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineColorButtonActionPerformed
        for (CADShape item : GraphicList) {
            if(item.getSelected()){
                 item.DrawColor = JColorChooser.showDialog(this, null, item.DrawColor);
                 LineColorPanel.setBackground(item.DrawColor);
            }
        }
    }//GEN-LAST:event_LineColorButtonActionPerformed

    private void MenuItemBackgroundcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBackgroundcolorActionPerformed
        Color CC = JColorChooser.showDialog(this, null, PaintPanel.getBackground());
        PaintPanel.setBackground(CC);
        ScrollPane.setBackground(CC);
    }//GEN-LAST:event_MenuItemBackgroundcolorActionPerformed

    private void MenuItemDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemDeletActionPerformed
        CADShape DeleteObject=null;
        
        for (CADShape item : GraphicList) {
            if(item.getSelected()){
                 PaintPanel.remove(item);
                 DeleteObject=item;//referenz holen da das object nicht in der schlaufe aus dem array gelöscht werden darf

            }
        }
        GraphicList.remove(DeleteObject);
        PaintPanel.repaint();
    }//GEN-LAST:event_MenuItemDeletActionPerformed

    private void MenuItemPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPasteActionPerformed
        
        try {
            try {
                GraphicList.add(CopyBuffer.getClass().getConstructor(CADShape.class).newInstance(CopyBuffer));
            } catch (InstantiationException ex) {
                Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        PaintPanel.add(GraphicList.get(GraphicList.size()-1));
        GraphicList.get(GraphicList.size()-1).addPropertyChangeListener(ShapePropertyListener);
        PaintPanel.repaint();
    }//GEN-LAST:event_MenuItemPasteActionPerformed

    private void MenuItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCopyActionPerformed
        for (CADShape item : GraphicList) {
            if(item.getSelected()){
                CopyBuffer = item;
            }
        }
    }//GEN-LAST:event_MenuItemCopyActionPerformed

    private void PaintPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaintPanelMousePressed
        FirstClick = evt.getPoint();
        try {
            GraphicList.add(ShapeStyle.getClass().getConstructor(Point.class).newInstance(FirstClick));
            GraphicList.get(GraphicList.size() - 1).addPropertyChangeListener(ShapePropertyListener);

        } catch (Exception error) {//TODO: Ist vielleicht überflüssig, ->immer mind. eine form angewählt
            // TODO Auto-generated catch block
            error.printStackTrace();
            JOptionPane.showMessageDialog(null, "Bitte wählen Sie zuerst eine Form aus", "Keine Form ausgewählt", JOptionPane.OK_CANCEL_OPTION);
        }
        PaintPanel.add(GraphicList.get(GraphicList.size()-1));
        PaintPanel.moveToFront(GraphicList.get(GraphicList.size() - 1));
    }//GEN-LAST:event_PaintPanelMousePressed

    /*
    * Aus Handout "Serialisierung in JAVA" von G.Krucker übernommen
    */
    public void saveToFile(String filename) throws IOException { 
    // Ausschreiben der Liste in das File 
        FileOutputStream file = new FileOutputStream(filename); 
        try (ObjectOutputStream OutputStream = new ObjectOutputStream(file)) {
            OutputStream.writeObject(GraphicList);
            OutputStream.flush();
        } 
    }

    /*
    * Aus Handout "Serialisierung in JAVA" von G.Krucker übernommen
    */
    @SuppressWarnings("unchecked") 
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException{
        // Einlesen vom File 
        for (CADShape item : GraphicList) {
            
            PaintPanel.remove(item);

        }
        
        GraphicList = new ArrayList<CADShape>(); 
        FileInputStream file = new FileInputStream(filename); 
        ObjectInputStream InputStream = new ObjectInputStream(file); 
        GraphicList=(ArrayList<CADShape>) InputStream.readObject(); 
        InputStream.close(); 
        
        
        for (CADShape item : GraphicList) {
            
            PaintPanel.add(item);
            item.addPropertyChangeListener(ShapePropertyListener);
            item.InitMouseListener();
            
        }
        PaintPanel.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ArrowButton;
    private javax.swing.JCheckBoxMenuItem CheckBoxGrid;
    private javax.swing.JCheckBoxMenuItem CheckBoxToolBar;
    private javax.swing.JToggleButton CircleButton;
    private javax.swing.JToggleButton EllipseButton;
    private javax.swing.JButton FillColorButton;
    private javax.swing.JPanel FillColorPanel;
    private javax.swing.JToggleButton LineButton;
    private javax.swing.JButton LineColorButton;
    private javax.swing.JPanel LineColorPanel;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenuItem MenuItemBackgroundcolor;
    private javax.swing.JMenuItem MenuItemClose;
    private javax.swing.JMenuItem MenuItemCopy;
    private javax.swing.JMenuItem MenuItemDelet;
    private javax.swing.JMenuItem MenuItemOpen;
    private javax.swing.JMenuItem MenuItemPaste;
    private javax.swing.JMenuItem MenuItemPrint;
    private javax.swing.JMenuItem MenuItemSave;
    private javax.swing.JMenu MenuView;
    private javax.swing.JLayeredPane PaintPanel;
    private javax.swing.JToggleButton RectangleButton;
    private javax.swing.JPanel ReservePanel;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JToggleButton SquareButton;
    private javax.swing.JToolBar ToolBar;
    // End of variables declaration//GEN-END:variables
}
