package Carro;

import Relogio.Relogio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Digite a marca:");
        carro.marca = leia.nextLine();
        System.out.println("Digite o modelo:");
        carro.modelo = leia.nextLine();
        System.out.println("Digite o ano:");
        carro.ano = leia.nextInt();
        carro.exibirCarro();
    }
}
