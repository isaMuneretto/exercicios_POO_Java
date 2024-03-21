package Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = leia.nextLine();

        System.out.println("Digite preço do produto:");
        produto.preco = leia.nextDouble();

        System.out.println("Digite a quantidade do produto em estoque: ");
        produto.quantidade = leia.nextInt();

        produto.valorTotal();
    }
}