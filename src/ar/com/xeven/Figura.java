package ar.com.xeven;

public abstract class Figura {
    //atributos
    protected Double perimetro;
    protected Double area;
    protected String color;

    //getters y setters
    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public abstract Double getPerimetro();

    public abstract Double getArea();



}
