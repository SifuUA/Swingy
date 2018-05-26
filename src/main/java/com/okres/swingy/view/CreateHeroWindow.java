package com.okres.swingy.view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class CreateHeroWindow extends JFrame {

    private JPanel CreateHeroWindow;
    private JButton jButton6;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JSlider jSlider1;
    private JTextField jTextField2;

    public CreateHeroWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        CreateHeroWindow = new JPanel();
        jTextField2 = new JTextField();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel8 = new JLabel();
        jSlider1 = new JSlider();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jButton6 = new JButton();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel5 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(2);
        jSlider1.setPaintTicks(true);
        jSlider1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jSlider1.setInheritsPopupMenu(true);
        jSlider1.setLabelTable(jSlider1.createStandardLabels(20));
        jSlider1.setPaintLabels(true);
        CreateHeroWindow.add(jSlider1);
        jSlider1.setBounds(350, 202, 204, 80);
        jSlider1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel9.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new Color(1, 1, 1));
        jLabel9.setText("Gender");
        CreateHeroWindow.add(jLabel9);
        jLabel9.setBounds(150, 310, 110, 29);

        jLabel10.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new Color(1, 1, 1));
        jLabel10.setText("50");
        CreateHeroWindow.add(jLabel10);
        jLabel10.setBounds(445, 210, 20, 10);



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

        jRadioButton2.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new Color(1, 1, 1));
        jRadioButton2.setText("Female");
        CreateHeroWindow.add(jRadioButton2);
        jRadioButton2.setBounds(350, 340, 76, 24);

        jLabel5.setForeground(new Color(1, 1, 1));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/img/background4.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jLabel5.setInheritsPopupMenu(false);
        CreateHeroWindow.add(jLabel5);
        jLabel5.setBounds(0, 0, 700, 600);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CreateHeroWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CreateHeroWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jRadioButton1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void jSlider1StateChanged(ChangeEvent evt){
        jLabel10.setText(Integer.toString(jSlider1.getValue()));
    }

    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateHeroWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateHeroWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateHeroWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateHeroWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateHeroWindow().setVisible(true);
            }
        });
    }
}
