package com.okres.swingy.util;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class NewApplication extends JFrame {
    private JPanel BattleWindow;
    private JPanel CreateHeroWindow;
    private JPanel SelectWindow;
    private JButton Start;
    private JPanel StartWindow;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JList<String> jList1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JSeparator jSeparator1;
    private JSlider jSlider1;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JTextField jTextField2;
    private ButtonGroup myGr;

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewApplication().setVisible(true);
            }
        });
    }

    public NewApplication() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        myGr = new ButtonGroup();
        StartWindow = new JPanel();
        Start = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel1 = new JLabel();
        SelectWindow = new JPanel();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<>();
        jScrollPane2 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jButton4 = new JButton();
        jLabel4 = new JLabel();
        BattleWindow = new JPanel();
        jScrollPane3 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jSeparator1 = new JSeparator();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jButton5 = new JButton();
        jButton7 = new JButton();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        CreateHeroWindow = new JPanel();
        jTextField2 = new JTextField();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel8 = new JLabel();
        jSlider1 = new JSlider();
        jLabel9 = new JLabel();
        jButton6 = new JButton();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel5 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new CardLayout());

        StartWindow.setToolTipText("");
        StartWindow.setName("StartWindow1"); // NOI18N
        StartWindow.setPreferredSize(new Dimension(700, 600));
        StartWindow.setLayout(null);

        Start.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        Start.setText("Start");
        Start.setName("Start"); // NOI18N
        Start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        StartWindow.add(Start);
        Start.setBounds(220, 155, 270, 90);
        Start.getAccessibleContext().setAccessibleDescription("");

        jButton2.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jButton2.setText("Score");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        StartWindow.add(jButton2);
        jButton2.setBounds(220, 270, 270, 90);

        jButton3.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        StartWindow.add(jButton3);
        jButton3.setBounds(220, 390, 270, 90);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/okres/swingy/view/vtr1a.jpg")));  // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new Dimension(700, 600));
        jLabel1.setMinimumSize(new Dimension(700, 600));
        jLabel1.setPreferredSize(new Dimension(700, 600));
        StartWindow.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 600);

        getContentPane().add(StartWindow, "card4");

        SelectWindow.setPreferredSize(new Dimension(700, 600));
        SelectWindow.setLayout(null);

        jList1.setFont(new Font("Noto Sans", 1, 12)); // NOI18N
        jList1.setModel(new AbstractListModel<String>() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);

        SelectWindow.add(jScrollPane1);
        jScrollPane1.setBounds(70, 80, 170, 300);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Noto Sans", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        SelectWindow.add(jScrollPane2);
        jScrollPane2.setBounds(340, 80, 290, 300);

        jLabel2.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new Color(1, 1, 1));
        jLabel2.setText("Avaliable heroes");
        SelectWindow.add(jLabel2);
        jLabel2.setBounds(80, 50, 130, 17);

        jLabel3.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new Color(1, 1, 1));
        jLabel3.setText("Hero stats");
        SelectWindow.add(jLabel3);
        jLabel3.setBounds(430, 50, 90, 20);

        jButton1.setFont(new Font("Noto Sans", 1, 12)); // NOI18N
        jButton1.setText("Select Hero");
        SelectWindow.add(jButton1);
        jButton1.setBounds(100, 420, 100, 31);

        jButton4.setFont(new Font("Noto Sans", 1, 12)); // NOI18N
        jButton4.setText("New Hero");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        SelectWindow.add(jButton4);
        jButton4.setBounds(430, 420, 100, 31);

        jLabel4.setForeground(new Color(4, 5, 8));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/com/okres/swingy/view/background4"))); // NOI18N
        jLabel4.setText("jLabel4");
        SelectWindow.add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 500);

        getContentPane().add(SelectWindow, "card2");

        BattleWindow.setFont(new Font("Noto Sans", 0, 14)); // NOI18N
        BattleWindow.setPreferredSize(new Dimension(700, 600));
        BattleWindow.setLayout(null);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        jScrollPane3.setViewportView(jTextArea2);

        BattleWindow.add(jScrollPane3);
        jScrollPane3.setBounds(347, 50, 340, 500);

        jSeparator1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        BattleWindow.add(jSeparator1);
        jSeparator1.setBounds(55, 303, 290, 5);

        jLabel10.setFont(new Font("Noto Sans", 1, 22)); // NOI18N
        jLabel10.setForeground(new Color(1, 1, 1));
        jLabel10.setText("Actions");
        BattleWindow.add(jLabel10);
        jLabel10.setBounds(150, 310, 99, 29);

        jLabel11.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new Color(1, 1, 1));
        jLabel11.setText("Move");
        BattleWindow.add(jLabel11);
        jLabel11.setBounds(60, 360, 67, 30);

        jComboBox2.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jComboBox2.setForeground(new Color(1, 1, 1));
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        jComboBox2.setBorder(BorderFactory.createTitledBorder(""));
        BattleWindow.add(jComboBox2);
        jComboBox2.setBounds(220, 360, 87, 32);

        jButton5.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jButton5.setForeground(new Color(1, 1, 1));
        jButton5.setText("Fight");
        jButton5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        BattleWindow.add(jButton5);
        jButton5.setBounds(70, 460, 77, 30);

        jButton7.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jButton7.setForeground(new Color(1, 1, 1));
        jButton7.setText("Run");
        jButton7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        BattleWindow.add(jButton7);
        jButton7.setBounds(210, 460, 77, 30);

        jLabel12.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new Color(1, 1, 1));
        jLabel12.setText("Name");
        BattleWindow.add(jLabel12);
        jLabel12.setBounds(60, 60, 55, 26);

        jLabel13.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel13.setForeground(new Color(1, 1, 1));
        jLabel13.setText("Health");
        BattleWindow.add(jLabel13);
        jLabel13.setBounds(60, 110, 62, 26);

        jLabel14.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel14.setForeground(new Color(1, 1, 1));
        jLabel14.setText("Level");
        BattleWindow.add(jLabel14);
        jLabel14.setBounds(60, 160, 48, 26);

        jLabel15.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new Color(1, 1, 1));
        jLabel15.setText("Experiance");
        BattleWindow.add(jLabel15);
        jLabel15.setBounds(60, 210, 99, 26);

        jLabel16.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new Color(1, 1, 1));
        jLabel16.setText("Coordinates");
        BattleWindow.add(jLabel16);
        jLabel16.setBounds(60, 260, 109, 26);

        jLabel17.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel17.setForeground(new Color(1, 1, 1));
        jLabel17.setText("jLabel17");
        BattleWindow.add(jLabel17);
        jLabel17.setBounds(200, 60, 57, 20);

        jLabel18.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel18.setForeground(new Color(1, 1, 1));
        jLabel18.setText("jLabel18");
        BattleWindow.add(jLabel18);
        jLabel18.setBounds(200, 110, 57, 20);

        jLabel19.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel19.setForeground(new Color(1, 1, 1));
        jLabel19.setText("jLabel19");
        BattleWindow.add(jLabel19);
        jLabel19.setBounds(200, 160, 57, 20);

        jLabel20.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel20.setForeground(new Color(1, 1, 1));
        jLabel20.setText("jLabel20");
        BattleWindow.add(jLabel20);
        jLabel20.setBounds(200, 210, 57, 20);

        jLabel21.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel21.setForeground(new Color(1, 1, 1));
        jLabel21.setText("jLabel21");
        BattleWindow.add(jLabel21);
        jLabel21.setBounds(200, 260, 79, 20);

        jLabel22.setIcon(new ImageIcon(getClass().getResource("/com/okres/swingy/view/background4"))); // NOI18N
        jLabel22.setText("jLabel22");
        BattleWindow.add(jLabel22);
        jLabel22.setBounds(0, 0, 700, 600);

        getContentPane().add(BattleWindow, "card3");
        BattleWindow.getAccessibleContext().setAccessibleName("");

        CreateHeroWindow.setPreferredSize(new Dimension(700, 600));
        CreateHeroWindow.setLayout(null);

        jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        CreateHeroWindow.add(jTextField2);
        jTextField2.setBounds(350, 100, 200, 50);

        jLabel6.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new Color(1, 1, 1));
        jLabel6.setText("Hero Age");
        CreateHeroWindow.add(jLabel6);
        jLabel6.setBounds(150, 210, 110, 29);

        jLabel7.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new Color(1, 1, 1));
        jLabel7.setText("Hero Name");
        CreateHeroWindow.add(jLabel7);
        jLabel7.setBounds(150, 110, 110, 40);

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        jComboBox1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        CreateHeroWindow.add(jComboBox1);
        jComboBox1.setBounds(350, 400, 200, 50);

        jLabel8.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new Color(1, 1, 1));
        jLabel8.setText("Hero Class");
        CreateHeroWindow.add(jLabel8);
        jLabel8.setBounds(150, 410, 110, 30);

        jSlider1.setBackground(new Color(254, 254, 254));
        jSlider1.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jSlider1.setForeground(new Color(1, 1, 1));
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jSlider1.setInheritsPopupMenu(true);
        CreateHeroWindow.add(jSlider1);
        jSlider1.setBounds(350, 202, 204, 50);

        jLabel9.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new Color(1, 1, 1));
        jLabel9.setText("Gender");
        CreateHeroWindow.add(jLabel9);
        jLabel9.setBounds(150, 310, 110, 29);

        jButton6.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jButton6.setText("OK");
        jButton6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        CreateHeroWindow.add(jButton6);
        jButton6.setBounds(600, 500, 50, 50);

        myGr.add(jRadioButton1);
        jRadioButton1.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new Color(1, 1, 1));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        CreateHeroWindow.add(jRadioButton1);
        jRadioButton1.setBounds(350, 290, 59, 30);

        myGr.add(jRadioButton2);
        jRadioButton2.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new Color(1, 1, 1));
        jRadioButton2.setText("Female");
        CreateHeroWindow.add(jRadioButton2);
        jRadioButton2.setBounds(350, 340, 76, 24);

        jLabel5.setForeground(new Color(1, 1, 1));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/com/okres/swingy/view/background4"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jLabel5.setInheritsPopupMenu(false);
        CreateHeroWindow.add(jLabel5);
        jLabel5.setBounds(0, 0, 700, 600);

        getContentPane().add(CreateHeroWindow, "card3");

        pack();
    }// </editor-fold>                        

    private void StartActionPerformed(ActionEvent evt) {
        SelectWindow.setVisible(true);
        StartWindow.setVisible(false);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButton1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
}

