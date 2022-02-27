/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELI
 */
public class Rectangulo {
    double base;
    double altura;
    public Rectangulo(){
        base=100;
        altura=100;
    }
    public void setBase(double x){
        base=x;
    }
    public void setAltura(double x){
        altura=x;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public double getArea(){
        return base*altura;
    }
    public double getPerimetro(){
        return (2*base)+(2*altura);
    }
    public void cuadrar(){
        altura=base;
    }
}
