package exercicio01;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        //se o numero existir, será colocado no lugar da #, caso contrário, se tornará 0
        double valor;

        System.out.print("Nome do correntista: ");
        conta.correntista = entrada.next();
        conta.numero = rd.nextInt(1000, 9999);
        System.out.println("Conta: " + conta.numero);
        System.out.println("Saldo inicial R$ "+df.format(conta.saldo));

        System.out.println();
        System.out.print("Valor para depósito R$ ");
        valor = entrada.nextDouble();
        conta.depositar(valor);
        System.out.println("Saldo atual R$ "+df.format(conta.saldo));

        System.out.println();
        System.out.print("Valor para saque R$ ");
        valor = entrada.nextDouble();
        conta.sacar(valor);
        System.out.println("Saldo atual R$ "+df.format(conta.saldo));

    }
}
