package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checker();
                }
                catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(pnlMain, "Input must be an appropriate number!");
                }
                catch(Exception a) {
                    JOptionPane.showMessageDialog(pnlMain, "Input must be an appropriate number!");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();

        leap.setContentPane(leap.pnlMain);
        leap.setSize(500, 500);
        leap.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leap.setVisible(true);
        leap.setTitle("Leap Year Checker");

    }

    public void checker() {
        int year = Integer.parseInt(tfYear.getText());

        if((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) && year > 0)) {
            JOptionPane.showMessageDialog(pnlMain, "Leap year");
        }
        else {
            JOptionPane.showMessageDialog(pnlMain, "Not a leap Year");
        }
    }
}

