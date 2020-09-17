package main;

import java.util.Scanner;
import clases.Suma;
import clases.Resta;
import clases.Multiplicacion;
import clases.Division;

public class Main {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();

        System.out.println("Ingresa un número");
        double numero1 = scanner.nextDouble();
        suma.setNumero1(numero1);
        resta.setNumero1(numero1);
        multiplicacion.setNumero1(numero1);
        division.setNumero1(numero1);
        System.out.println("Ingresa otro número");
        double numero2 = scanner.nextDouble();
        suma.setNumero2(numero2);
        resta.setNumero2(numero2);
        multiplicacion.setNumero2(numero2);
        division.setNumero2(numero2);

        System.out.println("\nEl resultado de la suma es: " + suma.sumar());
        System.out.println("\nEl resultado de la resta es: " + resta.restar());
        System.out.println("\nEl resultado de la multiplicación es: " + multiplicacion.multiplicar());
        System.out.println("\nEl resultado de la división es: " + division.dividir());

    }

}
