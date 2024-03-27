package Animal;

public class Gato implements Animal {
    private String nome;
    private int idade;

    public Gato(String nome, int idade) {
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

    @Override
    public void emitirSom(String som) {  //aqui está na interface por isso tem parametro
        System.out.println("Gato faz " + som);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
    }
/*  esse método gera automaticamente, ao invés de fazer manualmente como acima no exibirDetalhes
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }*/
}
