/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poligonos;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends Poligono {
  
    private int numLados;
    private int longitudLado;
    private final static int Longitud_def=10;
    private final static int Color_def=1;
    
    public Cuadrado(){
        this(Longitud_def);
    }
    public Cuadrado(int longitudLado){
        this(longitudLado, Color_def);
    }
    public Cuadrado(int longitudLado, int color){
        super(color);
        this.numLados=4;
        this.longitudLado=longitudLado;
    }

    public int getNumLados() {
        return numLados;
    }

    public int getLongitudLado() {
        return longitudLado;
    }
    
    
    public int obtenerPerimetro(){
        return this.numLados * this.longitudLado;
    }
    
    public int obtenerArea(){
        return this.longitudLado*this.longitudLado;
    }
    
    public void agrandar(int cm){
        if(cm<0){
            //throw new IllegalArgumentException("cm<0");
            System.out.println("cm = " + cm);//warning
        }else{
        this.longitudLado=this.longitudLado+cm;
        }
    }
    public void reducir(int cm){
        if(cm<0){
            //throw new IllegalArgumentException("cm<0");
            System.out.println("cm = " + cm);// warning 
        }else{
        this.longitudLado=this.longitudLado-cm;
        }
        
    }
    
}
