package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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

    List<JCheckBox> selecOrder;
    List<JRadioButton> disCounts;


    public FoodOrderGUI() {
        selecOrder = new ArrayList<>();
        selecOrder.add(cPizza);
        selecOrder.add(cBurger);
        selecOrder.add(cFries);
        selecOrder.add(cSoftDrinks);
        selecOrder.add(cTea);
        selecOrder.add(cSundae);

        disCounts = new ArrayList<>();
        disCounts.add(rbNone);
        disCounts.add(rb5);
        disCounts.add(rb10);
        disCounts.add(rb15);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbNone.isSelected()) {
                    JOptionPane.showMessageDialog(pnlMain, String.format("The total price is Php %.2f", calcTotal()));
                }
                else if(rb5.isSelected() || rb10.isSelected() || rb15.isSelected()) {
                    JOptionPane.showMessageDialog(pnlMain, String.format("The total price is Php %.2f", calcDiscount()));
                }
                else {
                    JOptionPane.showMessageDialog(pnlMain, String.format("The total price is Php %.2f", calcTotal()));
                }
            }
        });
    }


    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();

        order.setContentPane(order.pnlMain);
        order.setSize(500, 500);
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setTitle("Food Ordering System");
        order.setVisible(true);
    }

    public double calcTotal() {
        int prize = 0;
        float total = 0;

        if(cPizza.isSelected()) {
            prize = 100;
            total += prize;
        }
        if(cBurger.isSelected()) {
            prize = 80;
            total += prize;
        }
        if(cFries.isSelected()) {
            prize = 65;
            total += prize;
        }
        if(cSoftDrinks.isSelected()) {
            prize = 55;
            total += prize;
        }
        if(cTea.isSelected()) {
            prize = 50;
            total += prize;
        }
        if(cSundae.isSelected()) {
            prize = 40;
            total += prize;
        }

        return total;
    }

    public double calcDiscount() {
        float initial = (float) calcTotal();
        float finPrice = 0;

        if(rb5.isSelected()) {
            finPrice = (float)(initial * .95);
        }
        else if(rb10.isSelected()) {
            finPrice = (float) (initial * .90);
        }
        else if(rb15.isSelected()) {
            finPrice = (float) (initial * .85);
        }
        return finPrice;

    }
}
