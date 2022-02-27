
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELI
 */
public class Ejercicio1 extends JFrame{
    public Ejercicio1(){
        this.setTitle("Ejericio1");
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel etiqueta1=new JLabel("Radio:");
        JLabel etiqueta2=new JLabel();
        etiqueta1.setBounds(10, 10, 50, 20);
        etiqueta2.setBounds(10, 80, 330, 20);
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.red);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        JButton btnCalcular=new JButton("CALCULAR");
        JButton btnLimpiar=new JButton("LIMPIAR");
        JButton btnPerimetro=new JButton("Perimetro");
        btnCalcular.setBounds(10, 40, 100, 30);
        btnLimpiar.setBounds(120, 40, 100, 30);
        btnPerimetro.setBounds(230,40,100, 30);
        panel.add(btnCalcular);
        panel.add(btnLimpiar);
        panel.add(btnPerimetro);
        JTextField txtRadio=new JTextField("0");
        txtRadio.setBounds(80, 10, 50, 20);
        panel.add(txtRadio);
        
        ActionListener oyente1=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    etiqueta2.setText(""+(Math.pow(2,Integer.parseInt(txtRadio.getText()))*Math.PI));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"error");
                }
            }
        };
        
        btnCalcular.addActionListener(oyente1);
        
        ActionListener oyente2=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    etiqueta2.setText(""+(Integer.parseInt(txtRadio.getText())*Math.PI*2));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"error");
                }
            }
        };
        
        btnPerimetro.addActionListener(oyente2);
        
        ActionListener oyente3=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                etiqueta2.setText("");
                txtRadio.setText("");
            }
        };
        
        btnLimpiar.addActionListener(oyente3);
        
    }
    public static void main(String[] args){  
        Ejercicio1 e1=new Ejercicio1();
        e1.setVisible(true);
    }
}
