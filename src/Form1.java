import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JPanel Panel1;
    private JTextField textField1;
    private JPasswordField textField2;
    private JButton loginButton;

    public Form1() {
        // Initialize components
        Panel1 = new JPanel();
        textField1 = new JTextField(15);
        textField2 = new JPasswordField(15); // Use JPasswordField for password input
        loginButton = new JButton("Login");

        // Set layout for the panel
        Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.Y_AXIS));

        // Add components with spacing
        Panel1.add(new JLabel("Username:"));
        Panel1.add(textField1);
        Panel1.add(Box.createVerticalStrut(10)); // Add spacing between components
        Panel1.add(new JLabel("Password:"));
        Panel1.add(textField2);
        Panel1.add(Box.createVerticalStrut(10));
        Panel1.add(loginButton);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = new String(textField2.getPassword()); // Get password safely
                if (username.equals("Ali") && password.equals("Ali")) {
                    JOptionPane.showMessageDialog(null, "Login successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form1");
        frame.setContentPane(new Form1().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
