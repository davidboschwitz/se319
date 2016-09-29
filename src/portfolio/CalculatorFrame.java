/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolio;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author davidboschwitz
 */
public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 275 , 400);
        setContentPane(new Calculator());
    }

    public static void main(String... args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalculatorFrame frame = new CalculatorFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
