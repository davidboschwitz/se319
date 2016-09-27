/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms319.proj1;

import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

/**
 *
 * @author davidboschwitz
 */
public class Calculator extends JPanel {

    /**
     * Creates new form CalculatorJPanel
     */
    public Calculator() {
        init();
    }

    private void init() {

        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        button18 = new JButton();
        button19 = new JButton();
        button20 = new JButton();

        textField1.setText("textField1");

        button1.setText("button1");

        button2.setText("button2");

        button3.setText("button3");

        button4.setText("button4");

        button5.setText("button5");

        button6.setText("button6");

        button7.setText("button7");

        button8.setText("button8");

        button9.setText("button9");

        button10.setText("button10");

        button11.setText("button11");

        button12.setText("button12");

        button13.setText("button13");

        button14.setText("button14");

        button15.setText("button15");

        button16.setText("button16");

        button17.setText("button17");

        button18.setText("button18");

        button19.setText("button19");

        button20.setText("button20");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(textField1)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(button2)
                                                .addComponent(button3)
                                                .addComponent(button4)
                                                .addComponent(button5)
                                                .addComponent(button1))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(button10)
                                                .addComponent(button9)
                                                .addComponent(button8)
                                                .addComponent(button7)
                                                .addComponent(button6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(button15)
                                                .addComponent(button14)
                                                .addComponent(button13)
                                                .addComponent(button12)
                                                .addComponent(button11))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(button20)
                                                .addComponent(button19)
                                                .addComponent(button18)
                                                .addComponent(button17)
                                                .addComponent(button16))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(button1)
                                                .addGap(18, 18, 18)
                                                .addComponent(button2)
                                                .addGap(18, 18, 18)
                                                .addComponent(button3)
                                                .addGap(18, 18, 18)
                                                .addComponent(button4)
                                                .addGap(18, 18, 18)
                                                .addComponent(button5))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(button6)
                                                .addGap(18, 18, 18)
                                                .addComponent(button10)
                                                .addGap(18, 18, 18)
                                                .addComponent(button9)
                                                .addGap(18, 18, 18)
                                                .addComponent(button8)
                                                .addGap(18, 18, 18)
                                                .addComponent(button7)))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(button11)
                                        .addGap(18, 18, 18)
                                        .addComponent(button15)
                                        .addGap(18, 18, 18)
                                        .addComponent(button14)
                                        .addGap(18, 18, 18)
                                        .addComponent(button13)
                                        .addGap(18, 18, 18)
                                        .addComponent(button12))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(button16)
                                        .addGap(18, 18, 18)
                                        .addComponent(button20)
                                        .addGap(18, 18, 18)
                                        .addComponent(button19)
                                        .addGap(18, 18, 18)
                                        .addComponent(button18)
                                        .addGap(18, 18, 18)
                                        .addComponent(button17)))
                        .addContainerGap(24, Short.MAX_VALUE))
        );
    }
    
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JTextField textField1;

}
