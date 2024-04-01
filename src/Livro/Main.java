package Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Algoritmos", "Fulano de Tal", 1945, 45.00);
        livro.exibirInformacoes();
        livro.aplicarDesconto(10);
        livro.exibirInformacoes();
    }
    }

}
