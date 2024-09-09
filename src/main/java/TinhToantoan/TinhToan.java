/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TinhToantoan;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
// *
 * @author ADMIN
 */
public class TinhToan extends JFrame {
    private JLabel lb1,lb2,lb3;
   private JTextField txt1,txt2,txt3;
   private JButton btcong,bttru,btnhan, btchia;

    public TinhToan() {
        setTitle("tinh toan don gian");
        taogiaodien();
        pack();
//        setSize(400,300);
        setLocationRelativeTo(null);
    }

    private void taogiaodien() {
        JPanel p1 =new JPanel();
        p1.setLayout(new GridLayout (3,2,5,5));
        p1.add(lb1=new JLabel("số 1"));
        p1.add(txt1=new JTextField());
        p1.add(lb2=new JLabel("số 2"));
        p1.add(txt2=new JTextField());
        p1.add(lb3=new JLabel("kết quả"));
        p1.add(txt3=new JTextField());
        
        JPanel p2 = new JPanel();
        p2.add(btcong=new JButton("cộng"));
        p2.add(bttru=new JButton("trừ"));
        p2.add(btnhan=new JButton("nhân"));
        p2.add(btchia=new JButton("chia"));
        
        //set bo cuc
        setLayout(new BorderLayout());
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        
        
    }
    public static void main(String[] args) {
        TinhToan frm= new TinhToan();
        frm.setVisible(true);
    }
}
