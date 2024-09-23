package Exercicios;



public class Funcionario {

	private String nomeFuncionario;
	private double salarioBruto;
	private String cargo;
	private double imposto;
	private double beneficios;
	
	public Funcionario(String nomeFuncionario, double salarioBruto, String cargo, double imposto, double beneficios) {
		this.nomeFuncionario = nomeFuncionario;
		this.salarioBruto = salarioBruto;
		this.cargo = cargo;	
		this.imposto = imposto;
		this.beneficios = beneficios;
	}
	
	public double calcularSalrioLiquido() {
		return salarioBruto - (salarioBruto * (imposto / 100)) + beneficios;
	}
	
	public void exibirDados() {
		
		System.out.println("Nome: "+ nomeFuncionario);
		System.out.println("Cargo: "+ cargo);
		System.out.println("Salário Bruto: R$ "+ salarioBruto);
		System.out.println("Salário Líquido: R$ "+ calcularSalrioLiquido());
	}
	 
}