package Animal;

public class Cachorro implements Animal {
    private String nome;
    private int idade;
    //como é private tem que ter getter e setter

    public Cachorro() {
        //construtor
    }

    //construtor com atributos
    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override //sobrescrita de método
    public void emitirSom(String som) {
        System.out.println("Cachorro faz " + som);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
    }
}
