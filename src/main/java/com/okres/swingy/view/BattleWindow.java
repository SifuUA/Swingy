package com.okres.swingy.view;

import com.okres.swingy.controller.GameController;
import com.okres.swingy.model.Hero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BattleWindow extends JFrame {

    private Hero hero;
    private JPanel battleWindow;
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
    JLabel jLabel1;
    private JPanel jPanel1 = new JPanel();
    private GameController gameController;


    public BattleWindow() {
        initComponents();
    }

    public BattleWindow(Hero hero) {
        this.hero = hero;
        System.out.println(hero.toString());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        battleWindow = new JPanel();
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
        jLabel1 = new JLabel();
        gameController = new GameController();
        //jPanel1 = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        battleWindow.setFont(new Font("Noto Sans", 0, 14)); // NOI18N
        battleWindow.setPreferredSize(new Dimension(700, 600));
        battleWindow.setLayout(null);
        gameController.vilainGen(hero);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
        );
        battleWindow.add(jPanel1);
        jPanel1.setBounds(350, 50, 300, 500);

        jLabel1.setText("<html><p>Welcome to the Game!!! <br/>" +
                "You are in the center of the dark wood and your goal is to find" +
                " road from it. <br/> Choose direction ang game will begin." +
                "<br/>Good luck!</p></html>");
        jLabel1.setVerticalAlignment(SwingConstants.CENTER);
        jLabel1.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new Color(1, 1, 1));
        jLabel1.setBounds(40, 40, 220, 420);
        jPanel1.add(jLabel1);

        jSeparator1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        battleWindow.add(jSeparator1);
        jSeparator1.setBounds(55, 303, 290, 5);

        jLabel10.setFont(new Font("Noto Sans", 1, 22)); // NOI18N
        jLabel10.setForeground(new Color(1, 1, 1));
        jLabel10.setText("Actions");
        battleWindow.add(jLabel10);
        jLabel10.setBounds(150, 310, 99, 29);

        jLabel11.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new Color(1, 1, 1));
        jLabel11.setText("Move");
        battleWindow.add(jLabel11);
        jLabel11.setBounds(60, 360, 67, 30);

        /**
         * Direction button
         */
        jComboBox2.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jComboBox2.setForeground(new Color(1, 1, 1));
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"North", "South", "West", "East"}));
        jComboBox2.setBorder(BorderFactory.createTitledBorder(""));
        jComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("In jComboBox2 X = " + hero.getX() + " Y = " + hero.getY());
                gameController.checkStep(jComboBox2.getSelectedIndex(), hero, gameController.getMap().length);
                jLabel21.setText(String.valueOf(hero.getX()) + ", " + hero.getY());
                //int i = gameController.getRandomStepTruble();
                jComboBox2.setEnabled(false);
                jButton5.setEnabled(true);
                jButton7.setEnabled(true);
                gameController.fightImitattion(hero, jLabel1, jButton5, jButton7, jComboBox2 );
            }
        });
        battleWindow.add(jComboBox2);
        jComboBox2.setBounds(220, 360, 100, 38);

        /**
         * Fight button
         */
        jButton5.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jButton5.setForeground(new Color(1, 1, 1));
        jButton5.setText("Fight");
        jButton5.setEnabled(false);
        jButton5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fight");
                jComboBox2.setEnabled(true);
                jButton5.setEnabled(false);
                jButton7.setEnabled(false);
            }
        });
        battleWindow.add(jButton5);
        jButton5.setBounds(70, 460, 77, 30);

        /**
         * Run button
         */
        jButton7.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jButton7.setForeground(new Color(1, 1, 1));
        jButton7.setText("Run");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameController.runButton(hero, jComboBox2.getSelectedIndex());
                System.out.println("Run!");
                jLabel21.setText(String.valueOf(hero.getX()) + ", " + hero.getY());
                jComboBox2.setEnabled(true);
                jButton7.setEnabled(false);
                jButton5.setEnabled(false);
            }
        });
        jButton7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        battleWindow.add(jButton7);
        jButton7.setBounds(210, 460, 77, 30);

        jLabel12.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new Color(1, 1, 1));
        jLabel12.setText("Name");
        battleWindow.add(jLabel12);
        jLabel12.setBounds(60, 60, 55, 26);

        jLabel13.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel13.setForeground(new Color(1, 1, 1));
        jLabel13.setText("Health");
        battleWindow.add(jLabel13);
        jLabel13.setBounds(60, 110, 62, 26);

        jLabel14.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel14.setForeground(new Color(1, 1, 1));
        jLabel14.setText("Level");
        battleWindow.add(jLabel14);
        jLabel14.setBounds(60, 160, 55, 26);

        jLabel15.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new Color(1, 1, 1));
        jLabel15.setText("Experiance");
        battleWindow.add(jLabel15);
        jLabel15.setBounds(60, 210, 99, 26);

        jLabel16.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new Color(1, 1, 1));
        jLabel16.setText("Coordinates");
        battleWindow.add(jLabel16);
        jLabel16.setBounds(60, 260, 109, 26);

        jLabel17.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel17.setForeground(new Color(1, 1, 1));
        jLabel17.setText(hero.getName());
        battleWindow.add(jLabel17);
        jLabel17.setBounds(207, 60, 140, 20);

        jLabel18.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel18.setForeground(new Color(1, 1, 1));
        jLabel18.setText(String.valueOf(hero.getHealth()));
        battleWindow.add(jLabel18);
        jLabel18.setBounds(207, 110, 140, 20);

        jLabel19.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel19.setForeground(new Color(1, 1, 1));
        jLabel19.setText(String.valueOf(hero.getLevel()));
        battleWindow.add(jLabel19);
        jLabel19.setBounds(207, 160, 140, 20);

        jLabel20.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel20.setForeground(new Color(1, 1, 1));
        jLabel20.setText(String.valueOf(hero.getExperience()));
        battleWindow.add(jLabel20);
        jLabel20.setBounds(207, 210, 140, 20);

        jLabel21.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jLabel21.setForeground(new Color(1, 1, 1));
        jLabel21.setText(String.valueOf(hero.getX()) + ", " + hero.getY());
        battleWindow.add(jLabel21);
        jLabel21.setBounds(207, 260, 140, 20);

        jLabel22.setIcon(new ImageIcon(getClass().getResource("/img/background4.png"))); // NOI18N
        jLabel22.setText("jLabel22");
        battleWindow.add(jLabel22);
        jLabel22.setBounds(0, 0, 700, 600);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 702, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(battleWindow, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(battleWindow, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();

    }
}