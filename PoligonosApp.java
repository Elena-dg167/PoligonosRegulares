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
public class PoligonosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //solo poner le valor
        Cuadrado c1=new Cuadrado(20);
        
        int perimetro =c1.obtenerPerimetro();
        System.out.printf("El cuadrado de lado %d tiene de perimetro %d%n",c1.getLongitudLado(), perimetro);
        
        Poligono p1=new Poligono (Poligono.Color_Azul,4, 20);
                
    }
}
