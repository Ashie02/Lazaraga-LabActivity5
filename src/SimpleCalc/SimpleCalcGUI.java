package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lblResult.setText(String.valueOf(calculate()));
                }
                catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(pnlMain, "Invalid Operation");
                } catch (divZero ex) {
                    JOptionPane.showMessageDialog(pnlMain, "Number cannot be divided by zero!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();

        calc.setContentPane(calc.pnlMain);
        calc.setSize(500, 500);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setTitle("Simple Calculator");
        calc.setVisible(true);
    }

    public double calculate() throws divZero {
        int n1 = Integer.parseInt(tfNumber1.getText());
        int n2 = Integer.parseInt(tfNumber2.getText());

        float no1 = (float)n1;
        float no2 = (float)n2;

        double res = 0;

        if(cbOperations.getSelectedItem().toString().equals("+")) {
            res = no1 + no2;
        }
        else if(cbOperations.getSelectedItem().toString().equals("-")) {
            res = no1 - no2;
        }
        else if(cbOperations.getSelectedItem().toString().equals("*")) {
            res = no1 * no2;
        }
        else if(cbOperations.getSelectedItem().toString().equals("/")) {
            if(no2 == 0) {
                throw(new divZero("Undefined"));
            }
            res = no1 / no2;
        }
        return res;
    }

    class divZero extends Exception {
        public divZero(String message) {
            super(message);
        }
    }
}
