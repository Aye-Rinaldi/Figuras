package ar.com.xeven;

public class Triangulo extends Figura{
    private Double lado1;
    private Double lado2;
    private Double lado3;



    public Triangulo(Double lado1, Double lado2, Double lado3,String color) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.color = color;
    }

    public Triangulo(Double lado1, Double lado2, Double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.color = "blanco";
    }

    @Override
    public Double getPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public Double getArea() {
        Double sp = (lado1+lado2+lado3)/2;
        area = (Math.sqrt(sp*(sp-lado1) * (sp-lado2) * (sp-lado3)));
        return area;
    }
}
