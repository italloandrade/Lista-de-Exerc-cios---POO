package Exercicios;

import java.util.Random;

public class JogoAdivinhacao {
    private int numeroAleatorio;     private int tentativas;       

    public JogoAdivinhacao() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(100) + 1;
        tentativas = 0;
    }

    public void fazerPalpite(int palpite) {
        tentativas++;
        if (palpite == numeroAleatorio) {
            System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
        } else if (palpite > numeroAleatorio) {
            System.out.println("O número é menor que " + palpite + ".");
        } else {
            System.out.println("O número é maior que " + palpite + ".");
        }
    }

    public boolean acertou(int palpite) {
        return palpite == numeroAleatorio;
    }
}

