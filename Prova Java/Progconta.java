import java.util.*;
public class Progconta {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        Conta Conta1 = new Conta("Lincoln", 5, "01/07/2021", 2807, 2200);

        Conta1.Iniciar();

        int opc = 1;

        while (opc == 1){
            System.out.print("\nSeu saldo atual e de R$" + Conta1.Saldo() + "\nInforme qual operacao deseja realizar?" + "\n1.Deposito" + "\n2.Saque" + "\n3.Rentabilidade\n");

            int operacao = sc.nextInt();

            if (operacao == 1){
                Conta1.Deposito();
            }
            else if (operacao == 2){
                Conta1.Saque();
            }
            else if (operacao == 3){
                Conta1.Rendimento();
            }
            else if (operacao >=4){
                System.out.print("\nEssa opcao nao existe\n");
            }
            System.out.print("\nDeseja realizar outra operacao\n1.Sim | 2.Nao\n");
            opc = sc.nextInt();
            }
        }
    }