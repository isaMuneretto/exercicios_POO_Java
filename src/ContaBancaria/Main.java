package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do titular:");
        contaBancaria.titular = leia.next();

        System.out.println("Digite o valor a ser depositado: ");
        double valor = leia.nextDouble();
        contaBancaria.depositar(valor);

        System.out.println("Digite o valor a ser sacado: ");
        valor = leia.nextDouble();
        contaBancaria.sacar(valor);
    }
}

/*
COM MÉTODO CONSTRUTOR

Scanner leia = new Scanner(System.in);
System.out.println("Digite o nome do titular:");
String.titular = leia.next();
System.out.println("Digite o saldo:");
double saldo = leia.nextDouble();
ContaBancaria contaBancaria = new ContaBancaria(titular,saldo);
...

COM ATRIBUTO PRIVATE E GET E SET
...
ContaBancaria contaBancaria = new ContaBancaria(titular,saldo);
System.out.println("Titular:"+contaBancaria.getTitular());
System.out.println("Digite o novo nome do titular:");
titular = leia.next();
contaBancaria.setTitular(titular);
*/