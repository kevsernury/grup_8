/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _grup_8.Interface;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Kevsernur
 */
public class swing {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Main");
        jf.setSize(1000, 600);
        jf.setLocation(1500, 200);

        jf.getContentPane().setLayout(new FlowLayout());
        JButton button1 = new JButton("Load");
        JTextField text1 = new JTextField(10);
        JLabel label = new JLabel();
        
        label.setText("");
        
        jf.getContentPane().add(text1);
        jf.getContentPane().add(button1);
       
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

}
