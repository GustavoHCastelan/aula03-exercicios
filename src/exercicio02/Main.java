package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double [] freqAlvo = paciente.frequenciaAlvo();

        System.out.print("Nome --> ");
        paciente.nome = entrada.nextLine();
        System.out.print("Idade --> ");
        paciente.idade = entrada.nextInt();

        System.out.println();
        System.out.println("Paciente: "+paciente.nome);
        System.out.println("Frequência Máxima: "+ paciente.frequenciaMaxima());
        System.out.println("Frequência Alvo ["+ freqAlvo[0]+", " + freqAlvo[1] +"]");

    }
}
