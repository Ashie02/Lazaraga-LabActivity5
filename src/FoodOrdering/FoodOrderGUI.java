package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI  extends JFrame{
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();

        order.setContentPane(order.pnlMain);
        order.setSize(500, 500);
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setTitle("Food Ordering System");
        order.setVisible(true);
    }
}
