package com.okres.swingy.view.temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewApplication extends JFrame {
    private JPanel BattleWindow;
    private JPanel SelectWindow;
    private JButton Start;
    private JPanel StartWindow;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JList<String> jList1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;

    public NewApplication() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

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
        BattleWindow = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 600));
        getContentPane().setLayout(new CardLayout());
        this.setVisible(true);

        StartWindow.setToolTipText("");
        StartWindow.setName("StartWindow1"); // NOI18N
        StartWindow.setPreferredSize(new Dimension(700, 600));
        StartWindow.setLayout(null);

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

        jButton2.setText("Score");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        StartWindow.add(jButton2);
        jButton2.setBounds(220, 270, 270, 90);

        jButton3.setText("Exit");
        StartWindow.add(jButton3);
        jButton3.setBounds(220, 390, 270, 90);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/okres/swingy/view/vtr1a.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new Dimension(700, 600));
        jLabel1.setMinimumSize(new Dimension(700, 600));
        jLabel1.setPreferredSize(new Dimension(700, 600));
        StartWindow.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 600);

        getContentPane().add(StartWindow, "card4");
        StartWindow.setVisible(true);

        SelectWindow.setPreferredSize(new Dimension(700, 600));
        SelectWindow.setVisible(false);

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setText("Avaliable heroes");

        jLabel3.setText("Hero stats");

        jButton1.setText("Select Hero");

        jButton4.setText("New Hero");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        GroupLayout SelectWindowLayout = new GroupLayout(SelectWindow);
        SelectWindow.setLayout(SelectWindowLayout);
        SelectWindowLayout.setHorizontalGroup(
                SelectWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(SelectWindowLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(GroupLayout.Alignment.TRAILING, SelectWindowLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(133, 133, 133)
                                .addComponent(jButton4)
                                .addGap(335, 335, 335))
                        .addGroup(SelectWindowLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SelectWindowLayout.setVerticalGroup(
                SelectWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(SelectWindowLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(SelectWindowLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SelectWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(SelectWindowLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton1))
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(SelectWindow, "card2");

        BattleWindow.setPreferredSize(new Dimension(700, 600));

        GroupLayout BattleWindowLayout = new GroupLayout(BattleWindow);
        BattleWindow.setLayout(BattleWindowLayout);
        BattleWindowLayout.setHorizontalGroup(
                BattleWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 747, Short.MAX_VALUE)
        );
        BattleWindowLayout.setVerticalGroup(
                BattleWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(BattleWindow, "card3");
        BattleWindow.getAccessibleContext().setAccessibleName("");
        BattleWindow.setVisible(false);
        pack();
    }

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewApplication().setVisible(true);
            }
        });
    }
}