package portfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;


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

        textField1.setText("");

        button1.setText("C");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                total = 0;
            }
        });

        button2.setText("7");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button2.getText());
            }
        });

        button3.setText("4");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button3.getText());
            }
        });
        button4.setText("1");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button4.getText());
            }
        });

        button5.setText("0");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button5.getText());
            }
        });

        button6.setText(". ");
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button6.getText());
            }
        });

        button7.setText("%");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mod(total);
            }
        });

        button8.setText("2");
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button8.getText());
            }
        });

        button9.setText("5");
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button9.getText());
            }
        });

        button10.setText("8");
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button10.getText());
            }
        });

        button11.setText("*");
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiply(total);
            }
        });

        button12.setText("^");
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                power(total);
            }
        });

        button13.setText("3");
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button13.getText());
            }
        });

        button14.setText("6");
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button14.getText());
            }
        });

        button15.setText("9");
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(button15.getText());
            }
        });

        button16.setText("=");
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finale();
            }
        });

        button17.setText("+/-");
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = Double.parseDouble(textField1.getText());
                total = 0 - total;
                textField1.setText(String.valueOf(total));
            }
        });

        button18.setText("/");
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divide(total);
            }
        });

        button19.setText("+");
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(total);
            }
        });

        button20.setText("-");
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtract(total);
            }
        });

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
    private double total = 0;
    private double last = 0;
    private int op = 0;
    private boolean extra = false;

    private void update(String value){
        if(extra){
            extra = false;
            textField1.setText("");
        }
        textField1.setText(textField1.getText() + value);
        total = Double.parseDouble(textField1.getText());
    }

    private void add(double total){
       if(textField1.getText().equals("")){
           op = 1;
       }
       else if(op==0){
           last = total;
           total = 0;
           textField1.setText("");
       }
       else{
           operation(op);
       }
        op = 1;
    }

    private void subtract(double total){
        if(textField1.getText().equals("")){
            op = 2;
        }
        else if(op==0){
            last = total;
            total = 0;
            textField1.setText("");
        }
        else{
            operation(op);
        }
        op = 2;
    }

    private void multiply(double total){
        if(textField1.getText().equals("")){
            op = 3;
        }
        else if(op==0){
            last = total;
            total = 0;
            textField1.setText("");
        }
        else{
            operation(op);
        }
        op = 3;
    }

    private void divide(double total){
        if(textField1.getText().equals("")){
            op = 4;
        }
        else if(op==0){
            last = total;
            total = 0;
            textField1.setText("");
        }
        else{
            operation(op);
        }
        op = 4;
    }

    private void mod(double total){
        if(textField1.getText().equals("")){
            op = 5;
        }
        else if(op==0){
            last = total;
            total = 0;
            textField1.setText("");
        }
        else{
            operation(op);
        }
        op = 5;
    }

    private void power(double total){
        if(textField1.getText().equals("")){
            op = 6;
        }
        else if(op==0){
            last = total;
            total = 0;
            textField1.setText("");
        }
        else{
            operation(op);
        }
        op = 6;
    }

    private void operation(int oper){
        if(oper == 1){
            last = last + total;
        }
        else if(oper == 2){
            last = last - total;
        }
        else if(oper == 3){
            last = last * total;
        }
        else if(oper == 4){
            if(total == 0){
                textField1.setText("divide by 0 error");
            }
            else{
                last = last / total;
            }

        }
        else if(oper == 5){
            last = last % total;
        }
        else if(oper == 6){
            last = Math.pow(last, total);
        }
        op = 0;
    }

    private void finale(){
        if(op==0){
            textField1.setText("");
        }
        else{
            operation(op);
            textField1.setText(String.valueOf(last));
            extra = true;
            total = last;
        }
    }
}
