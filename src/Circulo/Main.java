package Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = leia.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("Informe o raio:"+circulo.getRaio());
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

    }
}
