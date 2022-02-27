/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author ELI
 */
public class DialogoPresentacion {
    String programa,version, nombre;
    JDialog dialogo;
    JLabel eti1;
    JLabel eti2;
    JLabel eti3;
    JLabel eti4;
    public DialogoPresentacion(String programa,String version,String nombre){
        setNombrePrograma(programa);
        setNombreProgramador(nombre);
        setVersion(version);
        eti1=new JLabel(programa,SwingConstants.CENTER);
        eti2=new JLabel(version,SwingConstants.CENTER);
        eti3=new JLabel("programado por:",SwingConstants.CENTER);
        eti4=new JLabel(nombre,SwingConstants.CENTER);
        dialogo = new JDialog();
        dialogo.setSize(350,350);
        dialogo.setModal(true);
        dialogo.setLayout(null);
        iniciarComponentes();
        dialogo.setVisible(true);
    }
    public void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(10,10,dialogo.getHeight()-20,dialogo.getWidth()-20);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        dialogo.add(panel);
        eti1.setBounds(10,10,panel.getHeight()-20,30);
        eti2.setBounds(10,80,panel.getHeight()-20,20);
        eti3.setBounds(10,140,panel.getHeight()-20,20);
        eti4.setBounds(10,170,panel.getHeight()-20,20);
        eti1.setBorder(BorderFactory.createLineBorder(Color.black));
        eti2.setBorder(BorderFactory.createLineBorder(Color.black));
        eti4.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(eti1);
        panel.add(eti2);
        panel.add(eti3);
        panel.add(eti4);
        JButton boton=new JButton("Empezar");
        boton.setBounds((panel.getHeight()/2)-50,230,100,30);
        panel.add(boton);
        
        ActionListener oyente1=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dialogo.dispose();
            }
        };
        boton.addActionListener(oyente1);
    }
    private void setNombrePrograma(String s){
        programa=s;
    }
    private void setVersion(String s){
        version=s;
    }
    private void setNombreProgramador(String s){
        nombre=s;
    }
    
}
