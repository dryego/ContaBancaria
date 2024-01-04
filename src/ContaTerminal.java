import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Informe seu Nome e Sobrenome: ");
        String nome = scaner.nextLine();

        System.out.print("Informe o Numero da Conta: ");
        int numeroConta =  scaner.nextInt();

        System.out.print("Informe a Agencia: ");
        String agencia = scaner.next();

        System.out.print("Informe o Valor Depositado: ");
        double saldo = scaner.nextDouble();

        scaner.close();

        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco.%nSua agência é " + agencia + "%nConta " + numeroConta + "%nE seu saldo " + saldo + " já está disponível para saque");
    }
}
