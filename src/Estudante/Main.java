package Estudante;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Rhaisa",6,5);
        System.out.println("Estudante: " + estudante1.getNome());
        System.out.println("Nota 1: " + estudante1.getNota1());
        System.out.println("Nota 2: " + estudante1.getNota2());
        System.out.println("Média: " + estudante1.calcularMedia());
        System.out.println("Está aprovado? " + (estudante1.estaAprovado() ? "Sim" : "Não"));
    }
}
