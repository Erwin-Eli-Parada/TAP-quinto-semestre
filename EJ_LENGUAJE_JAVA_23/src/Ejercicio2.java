/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ELI
 */
public class Ejercicio2 extends JFrame{
    public Ejercicio2(){
        this.setTitle("Ejericio2");
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel etiqueta1=new JLabel("V=S/t");
        JLabel etiqueta2=new JLabel("S=V*t");
        JLabel etiqueta3=new JLabel("Espacio:");
        JLabel etiqueta4=new JLabel("Velocidad:");
        JLabel etiqueta5=new JLabel("Tiempo:");
        JLabel etiqueta6=new JLabel("Tiempo:");
        JLabel etiqueta7=new JLabel("Velocidad:");
        JLabel etiqueta8=new JLabel("Espacio:");
        JLabel etiqueta9=new JLabel();
        JLabel etiqueta10=new JLabel();
        etiqueta1.setBounds(10, 10, 70, 20);
        etiqueta2.setBounds(170, 10, 70, 20);
        etiqueta3.setBounds(10, 40, 70, 20);
        etiqueta4.setBounds(170, 40, 70, 20);
        etiqueta5.setBounds(10, 70, 70, 20);
        etiqueta6.setBounds(170, 70, 70, 20);
        etiqueta7.setBounds(10, 100, 70, 20);
        etiqueta8.setBounds(170, 100, 70, 20);
        etiqueta9.setBounds(90, 100, 70, 20);
        etiqueta10.setBounds(250, 100, 70, 20);
        etiqueta9.setOpaque(true);
        etiqueta10.setOpaque(true);
        etiqueta9.setBackground(Color.yellow);
        etiqueta10.setBackground(Color.red);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        panel.add(etiqueta5);
        panel.add(etiqueta6);
        panel.add(etiqueta7);
        panel.add(etiqueta8);
        panel.add(etiqueta9);
        panel.add(etiqueta10);
        JTextField txtE1=new JTextField("0");
        JTextField txtV1=new JTextField("0");
        JTextField txtT1=new JTextField("0");
        JTextField txtT2=new JTextField("0");
        txtE1.setBounds(90, 40, 70, 20);
        txtV1.setBounds(250, 40, 70, 20);
        txtT1.setBounds(90, 70, 70, 20);
        txtT2.setBounds(250, 70, 70, 20);
        panel.add(txtE1);
        panel.add(txtV1);
        panel.add(txtT1);
        panel.add(txtT2);
        
        ActionListener oyente1=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    etiqueta9.setText(""+(Integer.parseInt(txtE1.getText())/Integer.parseInt(txtT1.getText())));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"error");
                }
            }
        };
        txtE1.addActionListener(oyente1);
        txtT1.addActionListener(oyente1);
        
        ActionListener oyente2=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    etiqueta10.setText(""+(Integer.parseInt(txtV1.getText())*Integer.parseInt(txtT2.getText())));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"error");
                }
            }
        };
        txtV1.addActionListener(oyente2);
        txtT2.addActionListener(oyente2);
    }
    public static void main(String[] args){  
        Ejercicio2 e1=new Ejercicio2();
        e1.setVisible(true);
    }
}
