package Retangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(); //criação do objeto que é uma instancia da classe retangulo
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor para altura:");
        double altura = leia.nextDouble();

        System.out.println("Digite um valor para largura:");
        double largura = leia.nextDouble();

        retangulo.calcularArea(altura,largura);
    }
}
