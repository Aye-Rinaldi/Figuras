package ar.com.xeven;
/*
Crear un sistema que permita calcular el perímetro y área de una figura.
Las figuras pueden ser cuadrados, triángulos o círculos.
Todas las figuras tienen un color asignado, que puede consultarse.
Nota: el valor de Pi pueden tomarlo como 3.14 o pueden usar la constante Math.PI
 */
public class Main {

    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado(10.00,"naranja");
        Cuadrado c2 = new Cuadrado(3.00);

        System.out.println("El perimetro de c1 es: "+c1.getPerimetro());
        System.out.println("El perimetro de c2 es: "+c2.getPerimetro());
        System.out.println("El area de c1 es: "+c1.getArea());
        System.out.println("El area de c2 es: "+c2.getArea());
        System.out.println();
        Triangulo t1 = new Triangulo(20.00,10.00,15.00,"verde");
        System.out.printf("El perimetro de t1 es %.2f: ",t1.getPerimetro());
        System.out.printf("\nEl area de t1 es %.2f: ",t1.getArea());
        System.out.println();
        Circulo circulo1 = new Circulo(3.00,"azul");
        System.out.printf("\nEl perimetro del circulo es %.2f: ",circulo1.getPerimetro());
        System.out.printf("\nEl area del circulo es %.2f: ",circulo1.getArea());







    }
}
