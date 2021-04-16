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
public class Poligono {
    //yo pondria los colores como string
    
    //constantes
    public static final int Color_Negro=0;
    public static final int Color_Verde=1;
    public static final int Color_Rojo=2;
    public static final int Color_Azul=3;
    
    public static final int numLados_def=3;
    public static final int longitudLado_def=10;
    
    //atributos 
    protected int color;
    protected boolean relleno;
    protected boolean giro;
    protected int anguloRotado;
    protected int numLados;
    protected int longitudLado;
    
    //constructores 

    public Poligono() {
        this(Color_Negro, numLados_def, longitudLado_def);
    }

    public Poligono(int color, int numLados, int longitudLado) {
        this.color = color;
        this.relleno=false;
        this.giro=false;
        this.anguloRotado=0;
        this.numLados=numLados;
        this.longitudLado=longitudLado;
    }
  
    //getters
    public int getColor() {
        return color;
    }
    
     public int getAnguloRotado() {
        return anguloRotado;
    }

    public int getNumLados() {
        return numLados;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public boolean isGiro() {
        return giro;
    }

    //metodos
    public void rotar(int grados){
        giro=true;
        anguloRotado=grados;
    }
    
    public void rellenar(){
        if(!relleno){
        relleno=true;
        }
    }
    public void vaciar(){
        if(relleno=true){
            relleno=false;
        }
    }
    
    public int obternerPerimetro(int longitudLado){
        return this.numLados * this.longitudLado;
    }
    
}
