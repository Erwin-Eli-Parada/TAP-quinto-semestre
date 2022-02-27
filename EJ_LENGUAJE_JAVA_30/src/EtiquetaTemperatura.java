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
public class EtiquetaTemperatura {
    JLabel etiqueta;
    double temperatura;
    public EtiquetaTemperatura(JLabel l){
        etiqueta=l;
    }
    public void setTemperatura(double d){
        temperatura=d;
        etiqueta.setText(d+"°C");
    }
    public double getTemperatura(){
        return temperatura;
    }
    public void mostrarColor(){
        etiqueta.setOpaque(true);
        if(temperatura<0){
            etiqueta.setBackground(Color.blue);
        }else if(temperatura>=0 && temperatura<10){
            etiqueta.setBackground(Color.cyan);
        }else if(temperatura>=10 && temperatura<25){
            etiqueta.setBackground(Color.magenta);
        }else if(temperatura>=25 && temperatura<35){
            etiqueta.setBackground(Color.orange);
        }else if(temperatura>=35){
            etiqueta.setBackground(Color.red);
        }else{
            etiqueta.setOpaque(false);
        }
    }
    public void cambiarTemperatura(Double d){
        temperatura+=d;
    }
}
