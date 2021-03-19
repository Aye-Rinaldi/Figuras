package ar.com.xeven;

public class Cuadrado extends Figura{
    //atributos
    private Double lado;

    //constructores
    public Cuadrado(Double lado,String color) {
        this.lado = lado;
        this.color = color;
    }

    public Cuadrado(Double lado) {
        this.lado = lado;
        this.color = "blanco";
        //this.setColor("blanco");
    }

    @Override
    public Double getPerimetro() {
        return lado*4;
    }

    @Override
    public Double getArea() {
        return lado*lado;
    }
}
