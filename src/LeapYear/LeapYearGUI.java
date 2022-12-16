package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;


    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();

        leap.setContentPane(leap.pnlMain);
        leap.setSize(500, 500);
        leap.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leap.setVisible(true);
        leap.setTitle("Leap Year Checker");

    }
}

