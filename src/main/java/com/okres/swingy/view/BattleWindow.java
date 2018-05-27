package com.okres.swingy.view;

import com.okres.swingy.model.Hero;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Logger;

import static java.util.logging.Level.SEVERE;

public class BattleWindow extends JFrame {

    private Hero hero;
    private JPanel BattleWindow;
    private JButton jButton5;
    private JButton jButton7;
    private JComboBox<String> jComboBox2;
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
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JScrollPane jScrollPane3;
    private JSeparator jSeparator1;
    private JTextArea jTextArea2;

    public BattleWindow() {
        initComponents();
    }

    public BattleWindow(Hero hero) {
        this.hero = hero;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

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

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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
        jComboBox2.setBounds(220, 360, 89, 34);

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

        jLabel22.setIcon(new ImageIcon(getClass().getResource("/img/background4.png"))); // NOI18N
        jLabel22.setText("jLabel22");
        BattleWindow.add(jLabel22);
        jLabel22.setBounds(0, 0, 700, 600);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 702, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(BattleWindow, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(BattleWindow, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
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
            Logger.getLogger(BattleWindow.class.getName()).log(SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BattleWindow.class.getName()).log(SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BattleWindow.class.getName()).log(SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(BattleWindow.class.getName()).log(SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleWindow().setVisible(true);
            }
        });
    }
}