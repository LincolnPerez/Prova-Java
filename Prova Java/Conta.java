import java.sql.Date;
import java.util.Scanner;
import java.util.*;



class Conta {
    Scanner sc = new Scanner(System.in);
    String iniciar;
    String titular;
    String data_abertura;
    int agencia;
    int saque;
    int deposito;
    int num_iden;
    int opc;
    double retirada;
    double rendimento;
    double saldo;
    


// Método Construtor //

public Conta(String titular,int agencia, String data_abertura, int num_iden, double saldo) {
this.titular = titular;
this.agencia = agencia;
this.data_abertura = data_abertura;
this.num_iden = num_iden;
this.saldo = saldo;


}

public void Iniciar(){
    System.out.print("\nOla, seja bem-vindo ao Banco do Lincoln \n");
}

public double Saldo(){
    return saldo;
}

public void Deposito(){
    System.out.print("\nInforme o valor que deseja depositar: \n");
    deposito = sc.nextInt();

    saldo = saldo + deposito;

    System.out.print("\nDeposito concluido\nO seu saldo e de R$" + saldo + "\n");
}

public void Saque(){
    System.out.print("\nInforme o valor que voce deseja sacar?\nO seu saldo e de R$" + saldo + "\n");
    retirada = sc.nextDouble();

    if (retirada > 0 && retirada < saldo){

        saldo = saldo - retirada;
        System.out.print("\nSaque concluido\nO seu saldo e de R$" + saldo + "\n");
        
    }
    else if (retirada == saldo){

        saldo = saldo - retirada;
        System.out.print("\nSaque concluido\nO seu saldo e de R$" + saldo + "\n");
    }
    else if (retirada > saldo){

        System.out.print("\nNao e possivel realizar a operacao, nao ha saldo suficiente ");
    }
    else  {
        System.out.print("\nNao houve movimentacao na sua conta");
    }
}

public void Rendimento (){
    rendimento = (saldo * 0.25)/100;
    System.out.print("\nO dinheiro presente em sua conta rendeu R$" + rendimento + "\n");
}
}










