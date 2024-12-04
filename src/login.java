import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);  // Center the window on screen

        // Set background color
        frame.getContentPane().setBackground(new Color(240, 240, 240));

        // Title label
        JLabel titleLabel = new JLabel("Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(0, 30, 400, 40);
        frame.add(titleLabel);

        // Username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameLabel.setBounds(50, 80, 100, 30);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameField.setBounds(150, 80, 200, 30);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        frame.add(usernameField);

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordLabel.setBounds(50, 130, 100, 30);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setBounds(150, 130, 200, 30);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        frame.add(passwordField);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(new Color(0, 123, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBounds(50, 200, 100, 30);
        frame.add(loginButton);

        // Register button
        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.BOLD, 14));
        registerButton.setBackground(new Color(40, 167, 69));
        registerButton.setForeground(Color.WHITE);
        registerButton.setBounds(160, 200, 100, 30);
        frame.add(registerButton);

        // Exit button
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 14));
        exitButton.setBackground(new Color(220, 53, 69));
        exitButton.setForeground(Color.WHITE);
        exitButton.setBounds(270, 200, 100, 30);
        frame.add(exitButton);

        // Add button action listeners
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("dinal") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Details are invalid");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Registration functionality not implemented yet.");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setResizable(false);
        frame.setVisible(true);
    }
}
