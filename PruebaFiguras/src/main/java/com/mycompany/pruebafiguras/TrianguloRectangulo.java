package com.mycompany.pruebafiguras;

public class TrianguloRectangulo {
   int base; // Atributo que define la base de un triángulo rectángulo
 int altura; // Atributo que define la altura de un triángulo rectángulo
 /**
 * Constructor de la clase TriánguloRectángulo
 * @param base Parámetro que define la base de un triángulo  
* rectángulo
 * @param altura Parámetro que define la altura de un triángulo  
* rectángulo
 */
 public TrianguloRectangulo(int base, int altura) {
 this.base = base;
 this.altura = altura;
 }
 /**
 * Metodo que calcula y devuelve el area de un triangulo rectangulo como la base multiplicada por la altura sobre 2 
 * @return Area de un triangulo rectangulo
 */
 double calcularArea() {
 return (base * altura / 2);
 }
 /**
 * Metodo que calcula y devuelve el perimetro de un triangulo rectangulo como la suma de la base, la altura y la hipotenusa 
 * @return Perimetro de un triangulo rectangulo
 */
 double calcularPerimetro() {
 return (base + altura + calcularHipotenusa()); /* Invoca al metodo calcular hipotenusa */  
}
/**
 * Método que calcula y devuelve la hipotenusa de un triángulo
 * rectángulo utilizando el teorema de Pitagoras
 * @return Hipotenusa de un triangulo rectangulo
 */
 double calcularHipotenusa() {
 return Math.pow(base*base + altura*altura, 0.5);
 }
 /**
 * Método que determina si un triángulo es:
 * - Equilatero: si sus tres lados son iguales
 * - Escaleno: si sus tres lados son todos diferentes
 * - Escaleno: si dos de sus lados son iguales y el otro es diferente de los demas
 */
public String determinarTipoTriangulo() {
    if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
        return "Triángulo equilátero"; // Todos sus lados son iguales
    } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())) {
        return "Triángulo escaleno"; // Todos sus lados son diferentes
    } else {
        return "Triángulo isósceles"; // De otra manera, es isósceles
    }
}
}

