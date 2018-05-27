package com.okres.swingy.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartWindow extends JFrame {

    private JButton Start;
    private JPanel StartWindow;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;

    public StartWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        StartWindow = new JPanel();
        Start = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        StartWindow.setToolTipText("");
        StartWindow.setName("StartWindow"); // NOI18N
        StartWindow.setPreferredSize(new java.awt.Dimension(700, 600));
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

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/img/vtr1a.jpg")));
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new Dimension(700, 600));
        jLabel1.setMinimumSize(new Dimension(700, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 600));
        StartWindow.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 600);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(StartWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(StartWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }

    private void StartActionPerformed(ActionEvent evt) {
        SelectWindow selectWindow= new SelectWindow();
        selectWindow.pack();
        selectWindow.setLocationRelativeTo(null);
        selectWindow.setVisible(true);
        selectWindow.setResizable(false);
        StartWindow.setVisible(false);
        dispose();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Here will be SCORE!!!");
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        StartWindow.setVisible(false);
        System.exit(0);
    }


}

