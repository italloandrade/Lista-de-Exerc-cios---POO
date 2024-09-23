package Exercicios;

public class Pessoa {

	private String nomePessoa;
    private int idade;
    private String profissao;

    public Pessoa(String nomePessoa, int idade, String profissao) {
        this.nomePessoa = nomePessoa;
        this.idade = idade;
        this.profissao = profissao;
    }

    public int calcularAnosBissextos() {
        int anosBissextos = 0;
        int anoAtual = 2024;
        int anoNascimento = anoAtual - idade;

        for (int ano = anoNascimento; ano <= anoAtual; ano++) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                anosBissextos++;
            }
        }
        return anosBissextos;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Anos bissextos vividos: " + calcularAnosBissextos());
    }
}
