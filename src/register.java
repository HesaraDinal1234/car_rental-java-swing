import java.awt.*;
import javax.swing.*;

public class register {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(true);

        frame.getContentPane().setBackground(new Color(240, 240, 240));

        JLabel titleLabel = new JLabel("Register", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(0, 30, 400, 40);
        frame.add(titleLabel);

        // Username label and field
        JLabel FullNamelb = new JLabel("Name:");
        FullNamelb.setFont(new Font("Arial", Font.PLAIN, 14));
        FullNamelb.setBounds(50, 80, 100, 30);
        frame.add(FullNamelb);

        JTextField FullNamefield = new JTextField();
        FullNamefield.setFont(new Font("Arial", Font.PLAIN, 14));
        FullNamefield.setBounds(150, 80, 200, 30);
        FullNamefield.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        frame.add(FullNamefield);

        // Password label and field
        JLabel Bnumberlbl = new JLabel("Bank number:");
        Bnumberlbl.setFont(new Font("Arial", Font.PLAIN, 14));
        Bnumberlbl.setBounds(50, 130, 100, 30);
        frame.add(Bnumberlbl);

        JPasswordField Bnumberfild = new JPasswordField();
        Bnumberfild.setFont(new Font("Arial", Font.PLAIN, 14));
        Bnumberfild.setBounds(150, 130, 200, 30);
        Bnumberfild.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        frame.add(Bnumberfild);

        JLabel idlbl = new JLabel("ID:");
        idlbl.setFont(new Font("Arial", Font.PLAIN, 14));
        idlbl.setBounds(50, 180, 100, 30);
        frame.add(idlbl);

        JPasswordField idfild = new JPasswordField();
        idfild.setFont(new Font("Arial", Font.PLAIN, 14));
        idfild.setBounds(150, 180, 200, 30);
        idfild.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        frame.add(idfild);

        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.PLAIN, 14));
        registerButton.setBounds(150, 230, 100, 30);
        frame.add(registerButton);

        JButton exit = new JButton("Exit");
        exit.setBounds(300, 230, 100, 30);
        exit.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(exit);
        // Center the window on screen
    }
}
