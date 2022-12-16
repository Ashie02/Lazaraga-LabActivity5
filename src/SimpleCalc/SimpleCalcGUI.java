package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        
    }


    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();

        calc.setContentPane(calc.pnlMain);
        calc.setSize(500, 500);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setTitle("Simple Calculator");
        calc.setVisible(true);
    }
}
