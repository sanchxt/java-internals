import java.awt.*;
import java.awt.event.*;

public class LoginWindow extends Frame implements ActionListener {
    Label lblUsername, lblPassword;
    TextField txtUsername, txtPassword;
    Button btnSave, btnExit;

    public LoginWindow() {
        setTitle("Login Window");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        lblUsername = new Label("Username:");
        add(lblUsername);

        txtUsername = new TextField();
        add(txtUsername);

        lblPassword = new Label("Password:");
        add(lblPassword);

        txtPassword = new TextField();
        txtPassword.setEchoChar('*'); // Mask the password characters
        add(txtPassword);

        btnSave = new Button("Save");
        add(btnSave);

        btnExit = new Button("Exit");
        add(btnExit);

        btnSave.addActionListener(this);
        btnExit.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnSave) {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } else if (ae.getSource() == btnExit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}