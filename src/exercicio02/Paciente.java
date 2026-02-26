package exercicio02;

public class Paciente {
    String nome;
    int idade;

    public int frequenciaMaxima () {
       return 220 - idade;
    }

    public double [] frequenciaAlvo() {
        double [] freqAlvo = new double[2]; //tudo que tem new é OBJETO
        int freqMax = frequenciaMaxima();
        freqAlvo[0] = freqMax*0.5;
        freqAlvo[1] = freqMax*0.85;
        return freqAlvo;
    }
}
