package bill;



import javax.swing.*;
import java.awt.event.*;

public class practise {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Electricity Bill Calculator");

        // Labels
        JLabel nameLabel = new JLabel("Consumer Name:");
        nameLabel.setBounds(50, 50, 150, 30);

        JLabel unitsLabel = new JLabel("Units Consumed:");
        unitsLabel.setBounds(50, 100, 150, 30);

        // Input Fields
        JTextField nameField = new JTextField();
        nameField.setBounds(200, 50, 150, 30);

        JTextField unitsField = new JTextField();
        unitsField.setBounds(200, 100, 150, 30);

        // Button
        JButton calcBtn = new JButton("Calculate Bill");
        calcBtn.setBounds(120, 160, 150, 30);

        // Action
        calcBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                int units = Integer.parseInt(unitsField.getText());

                double bill = 0;

                // Billing logic
                if (units <= 100) {
                    bill = units * 5;
                } else if (units <= 200) {
                    bill = (100 * 5) + (units - 100) * 7;
                } else {
                    bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
                }

                // Show result
                JOptionPane.showMessageDialog(frame,
                        "Consumer: " + name +
                        "\nUnits: " + units +
                        "\nTotal Bill: ₹" + bill);
            }
        });

        // Add components
        frame.add(nameLabel);
        frame.add(unitsLabel);
        frame.add(nameField);
        frame.add(unitsField);
        frame.add(calcBtn);

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}