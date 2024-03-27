package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Nome do cachorro:");
        String nome = leia.next();
        System.out.println("Idade:");
        int idade = leia.nextInt();
        Cachorro pug = new Cachorro(nome, idade);
        pug.exibirDetalhes();

        System.out.println("Nome do gato:");
        nome = leia.next();
        System.out.println("Idade:");
        idade = leia.nextInt();
        Gato miau = new Gato(nome, idade);
        System.out.println("Digite o som do gato:");
        String som = leia.next();
        miau.emitirSom(som);
        miau.exibirDetalhes();
        //System.out.println(miau.toString()); ao inves de fazer exibirDetalhes é só gerar o toString lá no Gato.java e chamar aqui
    }
}
