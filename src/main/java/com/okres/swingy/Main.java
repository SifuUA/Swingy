package com.okres.swingy;

import com.okres.swingy.view.console.StartConsole;
import com.okres.swingy.view.gui.StartWindow;

import javax.swing.*;
import java.net.URL;

public class Main {
    public static void main(final String args[]) throws ClassNotFoundException {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (args.length > 0) {
                if (args[0].equalsIgnoreCase("gui")) {
                    StartWindow startWindow = new StartWindow();
                    startWindow.pack();
                    startWindow.setLocationRelativeTo(null);
                    startWindow.setVisible(true);
                }else if (args[0].equalsIgnoreCase("console")) {
                    System.out.println("The Game launch in console mod ...");
                    StartConsole startConsole = new StartConsole();
                    startConsole.choose();
                }}
            }
        });
    }
}
