package ar.com.xeven;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Circulo extends Figura{
    private Double radio;

    public Circulo(Double radio,String color) {
        this.radio = radio;
        this.color =  color;
    }

    public Circulo(Double radio) {
        this.radio = radio;
        this.color = "blanco";
    }

    /*

            Área = π · r 2
     */

    @Override
    public Double getPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public Double getArea() {
        return Math.PI*Math.pow(radio,2);
    }
}
