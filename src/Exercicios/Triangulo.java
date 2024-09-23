package Exercicios;

public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1= lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public boolean isValido() {
		return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
	}
	
	public double calcularArea() {
		if(isValido()) {
			double semiPerimetro = (lado1 + lado2 + lado3) /2;
			return Math.sqrt(semiPerimetro *(semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
		}else {
			System.out.println("Os lados fornecidos não formam um triângulo válido.");
			return 0;
		}
	}

	public void exibirDados() {
		if(isValido()) {		
			System.out.println("Os lados formam um triângulo válido.");
			System.out.println("A área do triângulo é: "+ calcularArea() +" unidades².");
			System.out.println("Os lados fonecidos não formam um triângulo válido.");
		}
	}
}
