package Poligonos;
public class Hexagono extends Poligono {
    private int numLados;
    private int longitudLado;
    private final static int Longitud_def=10;
    private final static int Color_def=1;

    public Hexagono(int longitudLado){
        super(4, longitudLado, Poligono.Color_Azul);
    }
 
}
