package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Carta {
    private String cor;
    private String valor;

    public Carta(String cor, String valor) {
        this.cor = cor;
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return cor + " " + valor;
    }
}

class Jogador {
    private String nome;
    private List<Carta> mao;

    public Jogador(String nome) {
        this.nome = nome;
        mao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public void adicionarCarta(Carta carta) {
        mao.add(carta);
    }

    public void removerCarta(Carta carta) {
        mao.remove(carta);
    }

    public void exibirMao() {
        System.out.println(nome + "'s cartas: ");
        for (Carta carta : mao) {
            System.out.println(carta);
        }
    }
}

public class JogoCartas {
    private List<Carta> baralho;
    List<Jogador> jogadores;
    private Carta cartaAtual;

    public JogoCartas() {
        baralho = new ArrayList<>();
        jogadores = new ArrayList<>();
        inicializarBaralho();
    }
    
    private void inicializarBaralho() {
        String[] cores = { "Vermelho", "Azul", "Verde", "Amarelo" };
        String[] valores = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+2", "Reverso", "Pular" };

        for (String cor : cores) {
            for (String valor : valores) {
                baralho.add(new Carta(cor, valor));
                if (!valor.equals("0")) { 
                    baralho.add(new Carta(cor, valor));
                }
            }
        }
    }

    public void embaralharCartas() {
        Collections.shuffle(baralho);
        System.out.println("Cartas embaralhadas.");
    }

    public void adicionarJogador(String nome) {
        jogadores.add(new Jogador(nome));
        System.out.println("Jogador " + nome + " adicionado ao jogo.");
    }

    public void distribuirCartas(int numeroCartas) {
        for (Jogador jogador : jogadores) {
            for (int i = 0; i < numeroCartas; i++) {
                jogador.adicionarCarta(baralho.remove(0)); 
            }
        }
        System.out.println("Cartas distribuídas para os jogadores.");
    }
    
    public void iniciarRodada() {
        cartaAtual = baralho.remove(0);
        System.out.println("Carta inicial: " + cartaAtual);
    }

    public void jogarCarta(Jogador jogador, Carta carta) {
        if (carta.getCor().equals(cartaAtual.getCor()) || carta.getValor().equals(cartaAtual.getValor())) {
            cartaAtual = carta;
            jogador.removerCarta(carta);
            System.out.println(jogador.getNome() + " jogou " + carta);
        } else {
            System.out.println("Jogada inválida! A carta não corresponde à cor ou ao valor.");
        }
    }
    
    public void mostrarCartasJogador(Jogador jogador) {
        jogador.exibirMao();
    }
}
