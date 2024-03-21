package Retangulo;

public class Retangulo {

    double largura;
    double altura;

    public void calcularArea(double altura, double largura){
        double area = altura * largura; //como não pediu retorno , armazena na variavel area
        System.out.println("A área do retângulo é:"+area);
    }
}
