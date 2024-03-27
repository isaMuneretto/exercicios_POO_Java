package Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o nome do produto:");
        produto.nome = leia.next();

        System.out.println("Informe preço do produto:");
        produto.preco = leia.nextDouble();

        System.out.println("Informe a quantidade do produto: ");
        produto.quantidade = leia.nextInt();

        produto.valorTotal();
    }
}