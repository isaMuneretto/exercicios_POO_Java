package ContaBancaria;

public class ContaBancaria {
    String titular;
    double saldo = 0;


    /*
        MÉTODO CONSTRUTOR - já define as informações, não cria método vazio

        public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }*/
    /*
    MÉTODO GET E SET

     public String getTitular(){
        return this.titular;
     }
     public void setTitular(String titular){
        this.titular = titular;
     }
    */


    //Adicione um método para depositar dinheiro e outro para sacar dinheiro.
    public void depositar( double valor){ //preciso de alguma informação para depositar?
        this.saldo += valor;
        System.out.println("O saldo da conta é:"+this.saldo);
    }
    public void sacar( double valor){
        if (valor <= saldo){
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual:"+this.saldo);
        }else{
            System.out.println("O saldo é insuficiente.");
        }
    }
}