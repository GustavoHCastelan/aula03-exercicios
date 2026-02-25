package exercicio01;

public class Conta {
        String correntista;
        double saldo;
        int numero;

        public void depositar (double valor){
                saldo = saldo + valor;
        }

        public void sacar (double valor){
                saldo = saldo - valor;
        }

        //ctrl + D = duplicar

}
