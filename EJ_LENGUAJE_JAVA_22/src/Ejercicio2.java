
import java.awt.Color;
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
public class Ejercicio2 extends JFrame{
    public Ejercicio2(){
        this.setTitle("Ejericio2");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel eti1=new JLabel("PROVINCIAS:");
        JLabel eti2=new JLabel("TIPO ARTÍCULOS");
        JLabel eti3=new JLabel();
        eti1.setBounds(10, 30, 100, 20);
        eti2.setBounds(140, 30,100, 20);
        eti3.setBounds(150, 230,100, 20);
        eti3.setOpaque(true);
        eti3.setBackground(Color.CYAN);
        panel.add(eti1);
        panel.add(eti2);
        panel.add(eti3);
        String [] arre1={"Huelva","Sevilla","Cadiz","Malaga","Cordoba","Jaen","Granada","Almeria"};
        String [] arre2={"LIQUIDOS","MAQUINARIA","PELIGROSIDAD 1","PELIGROSIDAD 2","PIEZAS"};
        JList lista=new JList(arre1);
        lista.setBounds(10, 70, 100, 150);
        panel.add(lista);
        JComboBox listaD=new JComboBox(arre2);
        listaD.setBounds(140, 70, 100, 20);
        panel.add(listaD);
        JButton boton=new JButton("Cálculo Precio");
        boton.setBounds(10,230,120,20);
        panel.add(boton);
    }
    public static void main(String[] args) {
        Ejercicio2 e2=new Ejercicio2();
        e2.setVisible(true);
    }
}
