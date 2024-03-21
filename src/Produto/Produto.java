package Produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    //Implemente um método para calcular o valor total em estoque de um determinado produto escolhido por você.
    public void valorTotal(){
        double total = preco * quantidade;
        System.out.println("O valor total em estoque é de R$"+total);
    }
}