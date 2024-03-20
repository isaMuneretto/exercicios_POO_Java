package Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //criação do objeto retangulo
        Retangulo retangulo = new Retangulo();
        System.out.println("Digite um valor para altura:");
        retangulo.altura = leia.nextDouble();

        System.out.println("Digite um valor para largura:");
        retangulo.largura = leia.nextDouble();

        double area = retangulo.calcularArea();
        System.out.println("A área do retângulo é: " + area);
    }
}

