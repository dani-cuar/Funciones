package com.company;

public class Funciones {

    public static void main(String[] args) {

        double resultado = precioIva(50120);
        System.out.println("El precio mas iva es: " + resultado);
    }

    // Función que calcula el iva de 19% de un producto
    static double precioIva(double precio){

        double iva = (precio * 19)/100;
        return iva + precio;
    }
}
