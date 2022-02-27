/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELI
 */
public class Pedido {
    String articulo;
    int unidades;
    double precio, gastosenvio, descuento;
    public Pedido(){
        articulo="";
        unidades=1;
        precio=0;
        gastosenvio=3;
        descuento=0;
    }
    public void setArticulo(String s){
        articulo=s;
    }
    public void setUnidades(int x){
        unidades=x;
    }
    public void setPrecio(Double d){
        precio=d;
    }
    public void setGastosEnvio(Double d){
        gastosenvio=d;
    }
    public void setDescuento(Double d){
        descuento=d;
    }
    public String getArticulo(){
        return articulo;
    }
    public int getUnidades(){
        return unidades;
    }
    public double getPrecio(){
        return precio;
    }
    public double getGastosEnvio(){
        return gastosenvio;
    }
    public double getDescuento(){
        return descuento;
    }
    public double getTotalSinIva(){
        return (unidades*precio)+gastosenvio;
    }
    public double getIva(){
        return getTotalSinIva()*.16;
    }
    public double getTotalMasIva(){
        return getTotalSinIva()+getIva();
    }
    public double getTotalDescuento(){
        return getTotalMasIva()*descuento/100;
    }
    public double getTotalPedido(){
        return getTotalMasIva()-getTotalDescuento();
    }
}
