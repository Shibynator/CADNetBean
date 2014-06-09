/**
 * *****************************************************************************
 * Class:	MainView.java
 * *****************************************************************************
 * Company:	Berner Fachhochschule für Technik und Informatik
 *
 * Author:	Feuz Bruno
 *
 * Datum:       06.05.2014
 *
 * Project:	CADNetBean
 *
 * Describtion:	Erstellt das Hauptfenster des Programms.
 *              Beinhaltet die Actionlistener für sämtliche Bedienelemente und 
 *              die Zeichenfläche.
 *
 * Revision:	0.0	file created 
 *              0.1     modified	FB 06.05.2014
 *              1.0     final release   FB 09.06.2104
 * *****************************************************************************
 */
// Package definition
package cadnetbean;

// Import packages and libraries
import geometricforms.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainView extends javax.swing.JFrame implements Serializable {

    // Attributs
    private static final long serialVersionUID = 1L;
    private List<CADShape> GraphicList = new ArrayList<>();
    private CADShape ShapeStyle = new CADLine();
    private CADShape CopyBuffer;
    private Point FirstClick = new Point();
    public static boolean Saved = false;
    public static boolean Save = true;
    public SetCoordinates Coordinates;
    ToolBarButtonGroup ToolBarButtons = new ToolBarButtonGroup();
    SaveLoad SaveLoad = new SaveLoad();

    //PropertyChangeListener zum detektieren von Selektion-Vorgängen
    private final PropertyChangeListener ShapePropertyListener = new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent arg0) {
            Object sourceObject = arg0.getSource();
            
            if (sourceObject instanceof CADShape) {
                if (arg0.getPropertyName().equals("Selected")) {
                    if ((Boolean) arg0.getNewValue() != false) {
                        for (CADShape item : GraphicList) {
                            if (item != sourceObject) {
                                item.setSelected(false);
                            }
                        }
                    } 
                }
            }
        }
    };

    // Creates Frame of MainView
    public MainView() throws IOException {
        setBounds(100, 100, 500, 400); // Minimale Fenstergrösse
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);	// Beim Programmstart automatisch in Vollbildmodus
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(ImageIO.read(new File("src\\images\\CADIcon.jpg"))); // Icon des Programms definieren
        initComponents();   // Initialisierungsfunktion der Bedienelemente aufrufen
        initToolTipText();  // Initialisierungsfunktion für ToolTip-Texte aufrufen
    }

    /**
     * Diese Methode wird aus dem Konstruktor aufgerufen und wurde vom Designer
     * automatisch erzeugt und kann nicht bearbeitet werden. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolBar = new javax.swing.JToolBar();
        LineButton = new javax.swing.JToggleButton();
        RectangleButton = new javax.swing.JToggleButton();
        SquareButton = new javax.swing.JToggleButton();
        EllipseButton = new javax.swing.JToggleButton();
        CircleButton = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        FillColorButton = new javax.swing.JButton();
        FillColorPanel = new javax.swing.JPanel();
        LineColorButton = new javax.swing.JButton();
        LineColorPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        LineWidthComboBox = new javax.swing.JComboBox();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        MoveToFrontButton = new javax.swing.JButton();
        LayerUpButton = new javax.swing.JButton();
        LayerDownButton = new javax.swing.JButton();
        MoveToBackButton = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        PaintPanel = new javax.swing.JLayeredPane();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuItemOpen = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MenuItemSave = new javax.swing.JMenuItem();
        MenuItemSaveAs = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        MenuItemClose = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        MenuItemCopy = new javax.swing.JMenuItem();
        MenuItemPaste = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        MenuItemCoordinates = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        MenuItemDelet = new javax.swing.JMenuItem();
        MenuView = new javax.swing.JMenu();
        CheckBoxToolBar = new javax.swing.JCheckBoxMenuItem();
        MenuItemBackgroundcolor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CAD by ZioeFeu");
        setBackground(java.awt.SystemColor.activeCaption);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("MainView"); // NOI18N

        ToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ToolBar.setRollover(true);
        ToolBar.setAutoscrolls(true);
        ToolBar.setMaximumSize(new java.awt.Dimension(142, 42));
        ToolBar.setMinimumSize(new java.awt.Dimension(142, 42));
        ToolBar.setPreferredSize(new java.awt.Dimension(142, 42));

        ToolBarButtons.add(LineButton);
        LineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/line.gif"))); // NOI18N
        LineButton.setSelected(true);
        LineButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LineButton.setFocusable(false);
        LineButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LineButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        LineButton.setMaximumSize(new java.awt.Dimension(40, 40));
        LineButton.setMinimumSize(new java.awt.Dimension(20, 20));
        LineButton.setPreferredSize(new java.awt.Dimension(40, 40));
        LineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineButtonMouseClicked(evt);
            }
        });
        ToolBar.add(LineButton);

        ToolBarButtons.add(RectangleButton);
        RectangleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rectangle.gif"))); // NOI18N
        RectangleButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        SquareButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/square.gif"))); // NOI18N
        SquareButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        EllipseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ellipse.gif"))); // NOI18N
        EllipseButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        CircleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle.gif"))); // NOI18N
        CircleButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        ToolBar.add(jSeparator1);

        FillColorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FillIcon.gif"))); // NOI18N
        FillColorButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        FillColorPanel.setBackground(java.awt.Color.white);
        FillColorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        FillColorPanel.setMaximumSize(new java.awt.Dimension(40, 40));
        FillColorPanel.setMinimumSize(new java.awt.Dimension(40, 40));
        FillColorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FillColorPanelMouseClicked(evt);
            }
        });

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

        LineColorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BruschIcon.gif"))); // NOI18N
        LineColorButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        LineColorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineColorPanelMouseClicked(evt);
            }
        });

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
        ToolBar.add(jSeparator2);

        LineWidthComboBox.setBackground(java.awt.SystemColor.menu);
        LineWidthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1.00 Pkt", "2.00 Pkt", "3.00 Pkt", "4.00 Pkt", "5.00 Pkt" }));
        LineWidthComboBox.setToolTipText("");
        LineWidthComboBox.setMaximumSize(new java.awt.Dimension(80, 40));
        LineWidthComboBox.setMinimumSize(new java.awt.Dimension(40, 40));
        LineWidthComboBox.setPreferredSize(new java.awt.Dimension(80, 40));
        LineWidthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineWidthComboBoxActionPerformed(evt);
            }
        });
        ToolBar.add(LineWidthComboBox);

        jSeparator6.setToolTipText("Linewidth");
        ToolBar.add(jSeparator6);

        MoveToFrontButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forground.gif"))); // NOI18N
        MoveToFrontButton.setFocusable(false);
        MoveToFrontButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MoveToFrontButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        MoveToFrontButton.setMaximumSize(new java.awt.Dimension(40, 40));
        MoveToFrontButton.setMinimumSize(new java.awt.Dimension(20, 20));
        MoveToFrontButton.setPreferredSize(new java.awt.Dimension(40, 40));
        MoveToFrontButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MoveToFrontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveToFrontButtonActionPerformed(evt);
            }
        });
        ToolBar.add(MoveToFrontButton);

        LayerUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/layerup.gif"))); // NOI18N
        LayerUpButton.setFocusable(false);
        LayerUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LayerUpButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        LayerUpButton.setMaximumSize(new java.awt.Dimension(40, 40));
        LayerUpButton.setMinimumSize(new java.awt.Dimension(20, 20));
        LayerUpButton.setPreferredSize(new java.awt.Dimension(40, 40));
        LayerUpButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LayerUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LayerUpButtonActionPerformed(evt);
            }
        });
        ToolBar.add(LayerUpButton);

        LayerDownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/layerdown.gif"))); // NOI18N
        LayerDownButton.setFocusable(false);
        LayerDownButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LayerDownButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        LayerDownButton.setMaximumSize(new java.awt.Dimension(40, 40));
        LayerDownButton.setMinimumSize(new java.awt.Dimension(20, 20));
        LayerDownButton.setPreferredSize(new java.awt.Dimension(40, 40));
        LayerDownButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LayerDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LayerDownButtonActionPerformed(evt);
            }
        });
        ToolBar.add(LayerDownButton);

        MoveToBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.gif"))); // NOI18N
        MoveToBackButton.setFocusable(false);
        MoveToBackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MoveToBackButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        MoveToBackButton.setMaximumSize(new java.awt.Dimension(40, 40));
        MoveToBackButton.setMinimumSize(new java.awt.Dimension(20, 20));
        MoveToBackButton.setPreferredSize(new java.awt.Dimension(40, 40));
        MoveToBackButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MoveToBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveToBackButtonActionPerformed(evt);
            }
        });
        ToolBar.add(MoveToBackButton);

        ScrollPane.setFocusable(false);
        ScrollPane.setMaximumSize(new java.awt.Dimension(1000, 1000));
        ScrollPane.setPreferredSize(new java.awt.Dimension(500, 400));
        ScrollPane.setWheelScrollingEnabled(false);

        PaintPanel.setBackground(java.awt.Color.white);
        PaintPanel.setInputVerifier(PaintPanel.getInputVerifier());
        PaintPanel.setOpaque(true);
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
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        PaintPanelLayout.setVerticalGroup(
            PaintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
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
        MenuFile.add(jSeparator3);

        MenuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemSave.setText("save");
        MenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSaveActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemSave);

        MenuItemSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuItemSaveAs.setText("save as....");
        MenuItemSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSaveAsActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemSaveAs);
        MenuFile.add(jSeparator4);

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
        MenuEdit.add(jSeparator7);

        MenuItemCoordinates.setText("set coordinates");
        MenuItemCoordinates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCoordinatesActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemCoordinates);
        MenuEdit.add(jSeparator5);

        MenuItemDelet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        MenuItemDelet.setText("delete");
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
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Definiert die Texte, welche ein Bedienelement anzeigt, wenn mit dem
    // Mauszeiger darübergefahren wird. Wird im Konstruktor aufgerufen.
    private void initToolTipText() {
        LineButton.setToolTipText("draw line");
        CircleButton.setToolTipText("draw circle");
        RectangleButton.setToolTipText("draw rectangle");
        SquareButton.setToolTipText("draw square");
        EllipseButton.setToolTipText("draw ellipse");
        FillColorButton.setToolTipText("set fillcolor");
        FillColorPanel.setToolTipText("choose fillcolor");
        LineColorButton.setToolTipText("set linecolor");
        LineColorPanel.setToolTipText("choose linecolor");
        MoveToBackButton.setToolTipText("to background");
        MoveToFrontButton.setToolTipText("to forground");
        LayerDownButton.setToolTipText("layer down");
        LayerUpButton.setToolTipText("layer up");
        LineWidthComboBox.setToolTipText("line width");
    }

    /*
    * Die nachfolgenden Methoden sind Actionlistener für die Bedienelemente
    * der Toolbar und Menüleiste
    */
    
    // Öffnen einer Datei im Menü "File"
    private void MenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemOpenActionPerformed
        if (evt.getActionCommand().equals("open") == true) {
            loadfile();
        }
    }//GEN-LAST:event_MenuItemOpenActionPerformed

    // Speichern einer Datei
    private void MenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveActionPerformed
        if (evt.getActionCommand().equals("save") == true) {
            SaveLoad.savefile(GraphicList, false);
        }
    }//GEN-LAST:event_MenuItemSaveActionPerformed

    // Toolbar ein-/ausblenden
    private void CheckBoxToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxToolBarActionPerformed
        if (CheckBoxToolBar.isSelected() == true) {
            ToolBar.setVisible(true);
        } else {
            ToolBar.setVisible(false);
        }
    }//GEN-LAST:event_CheckBoxToolBarActionPerformed

    // Linie auswählen zum Zeichnen
    private void LineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineButtonMouseClicked
        ShapeStyle = new CADLine();
        Save = false;
    }//GEN-LAST:event_LineButtonMouseClicked

    // Rechteck auswählen zum Zeichnen
    private void RectangleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RectangleButtonMouseClicked
        ShapeStyle = new CADRectangle();
        Save = false;
    }//GEN-LAST:event_RectangleButtonMouseClicked

    // Quadrat auswählen zum Zeichnen
    private void SquareButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SquareButtonMouseClicked
        ShapeStyle = new CADSquare();
        Save = false;
    }//GEN-LAST:event_SquareButtonMouseClicked

    // Ellipse auswählen zum Zeichnen
    private void EllipseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EllipseButtonMouseClicked
        ShapeStyle = new CADEllipse();
        Save = false;
    }//GEN-LAST:event_EllipseButtonMouseClicked

    // Kreis auswählen zum Zeichnen
    private void CircleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CircleButtonMouseClicked
        ShapeStyle = new CADCircle();
        Save = false;
    }//GEN-LAST:event_CircleButtonMouseClicked

    /*
    * Fenster schliessen über Menü "File"
    * Überprüft, ob die Zeichnung abgespeichert ist. Wenn nicht Warnung ausgeben
    * und allenfalls abspeichern
    */ 
    private void MenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCloseActionPerformed
        if (evt.getActionCommand().equals("close") == true) {
            if (Save == true) {
                System.exit(0);
            } else {
                SaveDialogOnClose Warnung = new SaveDialogOnClose();
                if (Warnung.Option == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
                if (Warnung.Option == JOptionPane.YES_OPTION) {
                    SaveLoad.savefile(GraphicList, false);
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_MenuItemCloseActionPerformed

    // Ausgewähltem Objekt aktuelle Füllfarbe zuweisen
    private void FillColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillColorButtonActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                item.FillColor = FillColorPanel.getBackground();
                Save = false;
                item.repaint();
            }
        }
    }//GEN-LAST:event_FillColorButtonActionPerformed

    // Objekt mit Maus verschieben
    private void PaintPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaintPanelMouseDragged
               
        CADShape GeneratedShape = GraphicList.get(GraphicList.size() - 1);
        
        //Fenster aufziehen ->vier folgende verschiedene Szenarien können auftreten
        if (evt.getX() - FirstClick.x > 0 && evt.getY() - FirstClick.y > 0)//positiv width and height
        {
            GeneratedShape.setBounds(FirstClick.x, FirstClick.y, evt.getX() - FirstClick.x, evt.getY() - FirstClick.y);
            if(GeneratedShape instanceof CADLine)
                ((CADLine)GeneratedShape).Mirroring=false;
        } 
        else if (evt.getX() - FirstClick.x < 0 && evt.getY() - FirstClick.y > 0)//negativ width and positiv height
        {
            GeneratedShape.setBounds(evt.getX(), FirstClick.y, FirstClick.x - evt.getX(), evt.getY() - FirstClick.y);
            if(GeneratedShape instanceof CADLine)
                ((CADLine)GeneratedShape).Mirroring=true;
        } 
        else if (evt.getX() - FirstClick.x > 0 && evt.getY() - FirstClick.y < 0)//positiv width and negativ height
        {
            GeneratedShape.setBounds(FirstClick.x, evt.getY(), evt.getX() - FirstClick.x, FirstClick.y - evt.getY());
            if(GeneratedShape instanceof CADLine)
                ((CADLine)GeneratedShape).Mirroring=true;
        } 
        else if (evt.getX() - FirstClick.x < 0 && evt.getY() - FirstClick.y < 0)//negativ width and negativ height
        {
            GeneratedShape.setBounds(evt.getX(), evt.getY(), FirstClick.x - evt.getX(), FirstClick.y - evt.getY());
            if(GeneratedShape instanceof CADLine)
                ((CADLine)GeneratedShape).Mirroring=false;
        }
        
        GeneratedShape.repaint();
    }//GEN-LAST:event_PaintPanelMouseDragged

    // Ausgewähltes Objekt abwählen
    private void PaintPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaintPanelMouseClicked
        for (CADShape item : GraphicList) {

            item.setSelected(false);
            item.setOpaque(false);
        }
    }//GEN-LAST:event_PaintPanelMouseClicked

    // Ausgewähltem Objekt aktuelle Linienfarbe übergeben
    private void LineColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineColorButtonActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                item.DrawColor = LineColorPanel.getBackground();
                Save = false;
                item.repaint();
            }
        }
    }//GEN-LAST:event_LineColorButtonActionPerformed

    // Ausgewähltes Objekt löschen über Menü "Edit/delete"
    private void MenuItemDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemDeletActionPerformed
        CADShape DeleteObject = null;

        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                PaintPanel.remove(item);
                DeleteObject = item;//referenz holen da das object nicht in der schlaufe aus dem array gelöscht werden darf
                Save = false;
            }
        }
        GraphicList.remove(DeleteObject);
        PaintPanel.repaint();
    }//GEN-LAST:event_MenuItemDeletActionPerformed

    // Kopiertes Objekt einfügen über "Edit/paste" oder "ctrl+v"
    private void MenuItemPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPasteActionPerformed

        try {
            try {
                GraphicList.add(CopyBuffer.getClass().getConstructor(CADShape.class).newInstance(CopyBuffer));
                CopyBuffer = GraphicList.get(GraphicList.size() - 1);//neues element in den copybuffer legen für allfälliges erneutes aufrufen der Paste-Aktion
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        PaintPanel.add(GraphicList.get(GraphicList.size() - 1));
        GraphicList.get(GraphicList.size() - 1).addPropertyChangeListener(ShapePropertyListener);
        PaintPanel.repaint();
        Save = false;
    }//GEN-LAST:event_MenuItemPasteActionPerformed

    // Ausgewähltes Objekt kopiren über "Edit/copy" oder "ctrl+c"
    private void MenuItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCopyActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                CopyBuffer = item;
            }
        }
    }//GEN-LAST:event_MenuItemCopyActionPerformed

    // Neues Objekt zeichnen
    private void PaintPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaintPanelMousePressed
        FirstClick = evt.getPoint();
        CADShape NewElement=null;
        
        try {
            NewElement=ShapeStyle.getClass().getConstructor(Point.class).newInstance(FirstClick);
            GraphicList.add(NewElement);
            NewElement.addPropertyChangeListener(ShapePropertyListener);

        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException error) {            
            JOptionPane.showMessageDialog(null, "Bitte wählen Sie zuerst eine Form aus", "Keine Form ausgewählt", JOptionPane.OK_CANCEL_OPTION);
        }
        
        PaintPanel.add(NewElement);
        PaintPanel.moveToFront(NewElement);
        NewElement.LineThickness=GetLineThickness();
    }//GEN-LAST:event_PaintPanelMousePressed

    // Ausgewähltes Objekt mit Bedienelement "to background" in den Hintergrund verschieben
    private void MoveToBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveToBackButtonActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                PaintPanel.moveToBack((Component) item);
                Save = false;
            }
        }
    }//GEN-LAST:event_MoveToBackButtonActionPerformed

    // Ausgewähltes Objekt mit Bedienelement "layer up" eine Ebene nach oben verschieben
    private void LayerUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LayerUpButtonActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected() && PaintPanel.getPosition(item) > 0)//wenn position = 0 dann darf nicht nochmal dekrementiert werden, da position = -1 => movetoback()
            {
                PaintPanel.setPosition(item, PaintPanel.getPosition(item) - 1);
                Save = false;
            }
        }
    }//GEN-LAST:event_LayerUpButtonActionPerformed

    // Ausgewähltes Objekt mit Bedienelement "layer down" eine Ebene nach hinten verschieben
    private void LayerDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LayerDownButtonActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                PaintPanel.setPosition(item, PaintPanel.getPosition(item) + 1);
                Save = false;
            }
        }

    }//GEN-LAST:event_LayerDownButtonActionPerformed

    /*
    * Bei einem Mausklick auf das Element "choose fillcolor" Farbauswahlfenster
    * öffnen und ausgewählte Farbe im Panel anzeigen und an ausgewähltes Objekt
    * übergeben
    */
    private void FillColorPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FillColorPanelMouseClicked
        FillColorPanel.setBackground(JColorChooser.showDialog(this, null, Color.WHITE));
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                item.FillColor = FillColorPanel.getBackground();
                Save = false;
                item.repaint();
            }
        }
    }//GEN-LAST:event_FillColorPanelMouseClicked

    // Hintergrundfarbe der Zeichenfläche über "View/set backgroundcolor" verändern
    private void MenuItemBackgroundcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBackgroundcolorActionPerformed
        Color CC = JColorChooser.showDialog(this, null, PaintPanel.getBackground());
        PaintPanel.setBackground(CC);
    }//GEN-LAST:event_MenuItemBackgroundcolorActionPerformed

    /*
    * Bei einem Mausklick auf das Element "choose linecolor" Farbauswahlfenster
    * öffnen und ausgewählte Farbe im Panel anzeigen und an ausgewähltes Objekt
    * übergeben
    */
    private void LineColorPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineColorPanelMouseClicked
        LineColorPanel.setBackground(JColorChooser.showDialog(this, null, Color.WHITE));
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                item.DrawColor = LineColorPanel.getBackground();
                Save = false;
                item.repaint();
            }
        }
    }//GEN-LAST:event_LineColorPanelMouseClicked

    // Zeichnung speichern über "File/save as.." oder "ctrl+alt+s"
    private void MenuItemSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveAsActionPerformed
        SaveLoad.savefile(GraphicList, true);
    }//GEN-LAST:event_MenuItemSaveAsActionPerformed

    // Ausgewähltem Objekt die Linienbreite verstellen über Combopox "line width"
    private void LineWidthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineWidthComboBoxActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                item.LineThickness=GetLineThickness();
            }
            Save = false;
        }
    }//GEN-LAST:event_LineWidthComboBoxActionPerformed

    // Ausgewähltes Objekt mit Bedienelement "to forground" in den Vordergrund verschieben
    private void MoveToFrontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveToFrontButtonActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                PaintPanel.moveToFront((Component) item);
                Save = false;
            }
        }
    }//GEN-LAST:event_MoveToFrontButtonActionPerformed

    // Popupfenster zum verstellen der Koordinaten aufrufen über "Edit/set coordinates"
    private void MenuItemCoordinatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCoordinatesActionPerformed
        for (CADShape item : GraphicList) {
            if (item.getSelected()) {
                Coordinates = new SetCoordinates(item);
                Coordinates.setVisible(true);
            }
        }
        repaint();
    }//GEN-LAST:event_MenuItemCoordinatesActionPerformed

    /*
     * Methode um Files zu öffnen und laden
     */
    public void loadfile() {
        JFileChooser OPEN = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".cad files", "cad");
        OPEN.setFileFilter(filter);
        OPEN.setDialogTitle("Open...");
        OPEN.setDialogType(JFileChooser.OPEN_DIALOG); // Dialog zum Oeffnen
        int returnVal = OPEN.showOpenDialog(null); // Dialog an Parent-Window anhaengen 
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Ihre Wahl zum öffnen: " + OPEN.getSelectedFile().getName());
        }
        try {
            loadFromFile(OPEN.getSelectedFile().getAbsolutePath());
        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(null, "File couldn't been open", "File not found", JOptionPane.OK_CANCEL_OPTION);
        }
    }

    /*
     * Aus Handout "Serialisierung in JAVA" von G.Krucker übernommen
     */
    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        // Einlesen vom File 
        for (CADShape item : GraphicList) {
            PaintPanel.remove(item);
        }

        GraphicList = new ArrayList<>();
        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream InputStream = new ObjectInputStream(file);
        GraphicList = (ArrayList<CADShape>) InputStream.readObject();
        InputStream.close();

        for (CADShape item : GraphicList) {
            PaintPanel.add(item);
            item.addPropertyChangeListener(ShapePropertyListener);
            item.InitMouseListener();
            item.Initialise();
        }
        PaintPanel.repaint();
    }
    
    // Methode liest die aktuell eingestelle Linienbreite der Combobox und übergibt
    // diese an das neu zu zeichnende Objekt
    public float GetLineThickness(){
        
        switch (LineWidthComboBox.getSelectedIndex()) {
            case 0:
                return 1.00f;
            case 1:
                return 2.00f;
            case 2:
                return 3.00f;
            case 3:
                return 4.00f;
            case 4:
                return 5.00f;
            default:
                return 0f;
        }                           
    }
    
    /*
    * Vom Designer erzeugte Variablen der Bedienelemente, der Menüleiste und Toolbar 
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem CheckBoxToolBar;
    private javax.swing.JToggleButton CircleButton;
    private javax.swing.JToggleButton EllipseButton;
    private javax.swing.JButton FillColorButton;
    private javax.swing.JPanel FillColorPanel;
    private javax.swing.JButton LayerDownButton;
    private javax.swing.JButton LayerUpButton;
    private javax.swing.JToggleButton LineButton;
    private javax.swing.JButton LineColorButton;
    private javax.swing.JPanel LineColorPanel;
    private javax.swing.JComboBox LineWidthComboBox;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenuItem MenuItemBackgroundcolor;
    private javax.swing.JMenuItem MenuItemClose;
    private javax.swing.JMenuItem MenuItemCoordinates;
    private javax.swing.JMenuItem MenuItemCopy;
    private javax.swing.JMenuItem MenuItemDelet;
    private javax.swing.JMenuItem MenuItemOpen;
    private javax.swing.JMenuItem MenuItemPaste;
    private javax.swing.JMenuItem MenuItemSave;
    private javax.swing.JMenuItem MenuItemSaveAs;
    private javax.swing.JMenu MenuView;
    private javax.swing.JButton MoveToBackButton;
    private javax.swing.JButton MoveToFrontButton;
    private javax.swing.JLayeredPane PaintPanel;
    private javax.swing.JToggleButton RectangleButton;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JToggleButton SquareButton;
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
