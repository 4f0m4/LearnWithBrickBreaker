/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbb;


import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javafx.geometry.Insets;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author HP
 */
public class text extends JFrame {
    public int set;

    public void text1(String str) {
        // this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          //set size & position! this.setBounds(100,100,500,300);
        this.setLayout(new FlowLayout());
       
        JTextArea area = new JTextArea( str,22, 37);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);// so that a word dont break in middle
        // area.setMargin(new Inset(10,10,10,10));
        JScrollPane pane = new JScrollPane(area);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       Font f = new Font("verdana",Font.PLAIN,16);
       area.setFont(f);

        this.getContentPane().add(pane);
        this.setVisible(true);
        int ans = JOptionPane.showConfirmDialog(null, pane, "Click yes to continue", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (ans == 0) {
            GameRule gr = new GameRule(set);
           // System.out.print(set);
            gr.setVisible(true);
           
        } else {

            System.exit(0);

        }

    }

}

