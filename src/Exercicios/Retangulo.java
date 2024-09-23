package Exercicios;
import java.util.Scanner;

public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double calcularArea() {
		return altura * largura;
	}
	
	public double calcularPerimetro() {
		return 2* (altura + largura);
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	public double setLargura(double largura) {
		return largura;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		scanner.close();
	}
	
}
