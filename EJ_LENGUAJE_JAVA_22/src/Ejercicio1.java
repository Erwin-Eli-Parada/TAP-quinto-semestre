/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author ELI
 */
public class Ejercicio1 extends JFrame{
    public Ejercicio1(){
        this.setTitle("Ejericio1");
        this.setSize(350,400);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel etiqueta1=new JLabel("Espacio:");
        JLabel etiqueta2=new JLabel("Tiempo:");
        JLabel etiqueta3=new JLabel("Velocidad:");
        JLabel etiqueta4=new JLabel("RESULTADO");
        etiqueta1.setBounds(10, 50, 50, 20);
        etiqueta2.setBounds(150, 50, 50, 20);
        etiqueta3.setBounds(10, 120, 80, 20);
        etiqueta4.setBounds(150, 120, 80, 20);
        etiqueta4.setBackground(Color.green);
        etiqueta4.setOpaque(true);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        JTextField txtEspacio=new JTextField("0");
        JTextField txtTiempo=new JTextField("0");
        txtEspacio.setBounds(10, 75, 50, 20);
        txtTiempo.setBounds(150, 75, 50, 20);
        panel.add(txtEspacio);
        panel.add(txtTiempo);
        JButton btnCalcular=new JButton("CALCULAR");
        JButton btnLimpiar=new JButton("LIMPIAR");
        JButton btninfo=new JButton("?");
        btnCalcular.setBounds(10, 180, 100, 30);
        btnLimpiar.setBounds(120, 180, 100, 30);
        btninfo.setBounds(240, 180,50, 30);
        panel.add(btnCalcular);
        panel.add(btnLimpiar);
        panel.add(btninfo);
        JToggleButton metros=new JToggleButton("metros/seg");
        metros.setSelected(true);
        metros.setBounds(10, 230, 100,30);
        panel.add(metros);
        JSlider deslizador=new JSlider(0, 100, 20);
        deslizador.setBounds(10, 280, 200, 30);
        deslizador.setPaintTicks(true);
        deslizador.setMinorTickSpacing(5);
        panel.add(deslizador);
    }
    public static void main(String[] args){  
        Ejercicio1 e1=new Ejercicio1();
        e1.setVisible(true);
    }
    
}

