/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
/**
 *
 * @author ELI
 */
public class Ejercicio1 extends JFrame{
    public Ejercicio1(){
        this.setTitle("Ejericio1");
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel etiqueta1=new JLabel("Etiqueta",SwingConstants.CENTER);
        JLabel etiqueta2=new JLabel();
        etiqueta1.setBounds(10, 10, 100, 100);
        etiqueta2.setBounds(20, 20, 100, 100);
        etiqueta2.setOpaque(true);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.gray);
        etiqueta2.setBackground(Color.black);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        
        MouseListener oyenteMouse= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
               etiqueta1.setText("Esta pulsado");
               etiqueta1.setBounds(20,20,100,100);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
               etiqueta1.setText("Pulsado");
               etiqueta1.setBounds(10,10,100,100);
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                etiqueta1.setText("Pulsame");
            }

            @Override
            public void mouseExited(MouseEvent me) {
               etiqueta1.setText("Etiqueta");
            }
        };
        etiqueta1.addMouseListener(oyenteMouse);
    }
    public static void main(String[] args){  
        Ejercicio1 e1=new Ejercicio1();
        e1.setVisible(true);
    }
}
