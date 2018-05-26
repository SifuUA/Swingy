package com.okres.swingy.view;

import com.okres.swingy.model.LoginModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class SelectWindow extends JFrame {

    private JPanel SelectWindow;
    private JButton jButton1;
    private JButton jButton4;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JList<String> jList1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private LoginModel loginModel;


    public SelectWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

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
        loginModel = new LoginModel();
        String sql = "select * from heroes";

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SelectWindow.setPreferredSize(new Dimension(700, 600));
        SelectWindow.setLayout(null);

        jList1.setFont(new Font("Noto Sans", 1, 12)); // NOI18N
        try {
            loginModel.heroNameList(jList1, sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jList1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                try {
                     jList1MouseClicked(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jScrollPane1.setViewportView(jList1);

        SelectWindow.add(jScrollPane1);
        jScrollPane1.setBounds(70, 100, 180, 320);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Noto Sans", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        SelectWindow.add(jScrollPane2);
        jScrollPane2.setBounds(350, 100, 280, 320);

        jLabel2.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new Color(1, 1, 1));
        jLabel2.setText("Avaliable heroes");
        SelectWindow.add(jLabel2);
        jLabel2.setBounds(80, 70, 170, 17);

        jLabel3.setFont(new Font("Noto Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new Color(1, 1, 1));
        jLabel3.setText("Hero stats");
        SelectWindow.add(jLabel3);
        jLabel3.setBounds(430, 60, 120, 30);

        jButton1.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("Select Hero");
        SelectWindow.add(jButton1);
        jButton1.setBounds(110, 470, 110, 34);
        jButton1.setEnabled(false);

        jButton4.setFont(new Font("Noto Sans", 1, 14)); // NOI18N
        jButton4.setText("New Hero");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        SelectWindow.add(jButton4);
        jButton4.setBounds(440, 470, 100, 31);

        jLabel4.setForeground(new Color(4, 5, 8));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/img/background4.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        SelectWindow.add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 600);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 700, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(SelectWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(SelectWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }

    private void jList1MouseClicked(MouseEvent evt) throws SQLException {
        if (jList1.getSelectedValue() != null) {
            jButton1.setEnabled(true);
            loginModel.putOnTextErea(jTextArea1, jList1.getSelectedIndex());
            System.out.println(jList1.getSelectedValue());
            System.out.println(jList1.getSelectedIndex());
        }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        CreateHeroWindow createHeroWindow = new CreateHeroWindow();
        createHeroWindow.pack();
        createHeroWindow.setLocationRelativeTo(null);
        createHeroWindow.setVisible(true);
        SelectWindow.setVisible(false);
        dispose();
    }

//    public static void main(String args[]) {
//        try {
//            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SelectWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SelectWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SelectWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SelectWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SelectWindow().setVisible(true);
//            }
//        });
//    }
}

