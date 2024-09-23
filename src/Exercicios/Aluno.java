package Exercicios;

public class Aluno {

	private String nomeAluno;
	private String matricula;
	private double[] notas;
	
	public Aluno(String nomeAluno, String matricula, double[] notas) {
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.notas = notas;
	}
	
	public double calcularMedia() {
		double soma = 0;
		for(double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}
	
	public String verificarSituacao() {
		double media = calcularMedia();
		if(media >= 60.0) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}

	public String getNome() {
		return nomeAluno;
	}

	public void setNome(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: "+ nomeAluno);
		System.out.println("Matrícula: "+ matricula);
		System.out.println("Média: "+ calcularMedia());
		System.out.println("Situação: "+ verificarSituacao());
		
	}
}
