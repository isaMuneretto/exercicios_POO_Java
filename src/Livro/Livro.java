package Livro;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private double preco;

    public Livro(String titulo, String autor, int ano, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto) {
        preco -= preco * desconto / 100;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
