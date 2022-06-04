import java.util.Scanner;
import classes.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        Conta conta;
        
        System.out.print("INFORME O NÚMERO DA CONTA: ");
        int numero = sc.nextInt();
        System.out.print("INFORME O NOME DO TITULAR: ");
        sc.nextLine();
        String nome  = sc.nextLine();

        System.out.println("DESEJA REALIZAR UM DEPOSITO INICIAL(s/n)?");
        char resp = sc.next().charAt(0);

        if (resp == 's') {           
            System.out.println("INFORME O VALOR DO DEPÓSITO");
            double depInicial = sc.nextDouble();
            conta = new Conta(numero, nome, depInicial);
        } else {
            conta = new Conta(numero, nome);
        }

        System.out.println();
        System.out.println("DADOS DA CONTA: ");
        System.out.println(conta);

        System.out.print("VAMOS AO DEPÓSITO. QUANTO DESEJA DEPOSITAR? ");
        conta.deposito(sc.nextDouble());

        System.out.println();
        System.out.println("DADOS ATUALIZADOS DA CONTA: ");
        System.out.println(conta);
        
        System.out.print("QUAL O VALOR DO SAQUE? ");
        conta.saque(sc.nextDouble());
        
        System.out.println();
        System.out.println("DADOS ATUALIZADOS DA CONTA: ");
        System.out.println(conta);


        sc.close();
    }
}
