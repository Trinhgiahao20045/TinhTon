/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TinhToantoan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
// *
 * @author ADMIN
 */
public class Tinhtoanre extends JFrame {
    private JLabel lb1,lb2,lb3,lb4;
   private JTextField txt1,txt2,txt3;
   private JButton bttinh;
   private JComboBox<String> cbopheptinh;

    public Tinhtoanre() {
        setTitle("tinh toan don gian");
        taogiaodien();
        pack();
//        setSize(400,300);
        setLocationRelativeTo(null);
    }

    private void taogiaodien() {
        JPanel p1 =new JPanel();
        p1.setLayout(new GridLayout (4,2,5,5));
        p1.add(lb1=new JLabel("số 1"));
        p1.add(txt1=new JTextField());
        txt1.setPreferredSize(new Dimension(100,30));
        p1.add(lb2=new JLabel("số 2"));
        p1.add(txt2=new JTextField());
        
        
        
        p1.add(lb3=new JLabel("phep tinh"));
        p1.add(cbopheptinh= new JComboBox<>());
        
        p1.add(lb4=new JLabel("ket qua"));
        p1.add(txt3=new JTextField());
        
        add(p1);
        add(bttinh= new JButton("tinh"),BorderLayout.SOUTH);
        
       //tiep nhan su kien
//       bttinh.addActionListener(new ActionListener() );
//        @Override
        
        
        
    }
    public static void main(String[] args) {
        Tinhtoanre frm= new Tinhtoanre();
        frm.setVisible(true);
    }
}
