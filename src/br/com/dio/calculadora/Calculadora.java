package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b ;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subitrair = subitrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("a soma é " + somar);
        System.out.println("a subtração é " + subitrair);
        System.out.println("a multiplicação é " + multiplicar);
        System.out.println("a divisão é " + dividir);


    }
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subitrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static float dividir(float a, float b) {
        return a / b;
    }



}
