package bill;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1;

    login() {
        setTitle("Login System");

        l1 = new JLabel("Username : ");
        l2 = new JLabel("Password : ");
        l3 = new JLabel("");

        t1 = new JTextField(15);
        t2 = new JPasswordField(15);

        b1 = new JButton("Login");

        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);

        b1.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String user = t1.getText();
        String pass = t2.getText();

        if (user.equals("admin") && pass.equals("1234")) {
            l3.setText("Login Successful");
        } else {
            l3.setText("Invalid Login");
        }
    }

    public static void main(String args[]) {
        new login();
    }
}