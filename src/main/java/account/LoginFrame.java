/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class LoginFrame extends JFrame {

    private JLabel lbUser, lbPass;
    private JTextField txtUser;
    private JPasswordField txtpass;
    private JButton btLogin, btReset;

    public LoginFrame(String title) {
        super(title);
        CreateGUI();
        processEvent();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void CreateGUI() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 10, 10));
        p.add(lbUser = new JLabel("Username"));
        p.add(txtUser = new JTextField(10));
        p.add(lbPass = new JLabel("Password"));
        p.add(txtpass = new JPasswordField(10));
        p.add(btLogin = new JButton("Login"));
        p.add(btReset = new JButton("reset"));

        btReset.setIcon(new ImageIcon(this.getClass().getResource("/images/resett.png")));
        btLogin.setIcon(new ImageIcon(this.getClass().getResource("/images/enter.png")));

        add(p);
    }

    public static void main(String[] args) {
        LoginFrame frm = new LoginFrame("Login System");
        frm.setVisible(true);
    }

    private void processEvent() {

       btLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //code xu ly
                String user = txtUser.getText();
                String pass = txtpass.getText();
                if (user.equals("admin") || pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Dang nhap thanh cong");
                } else {
                    JOptionPane.showMessageDialog(null, "That bai", "Loi", JOptionPane.ERROR_MESSAGE);
                }
            }

            }
        );
    }
}
