package Exercicios;

public class Circuito {

		private static double areaPerimetro;
		
		public Circuito(double areaPerimetro) {
			this.areaPerimetro = areaPerimetro;
		}
		
		public double calcularArea() {
			return Math.PI * Math.pow(areaPerimetro, 2);
		}

		public double getAreaPerimetro() {
			return areaPerimetro;
		}

		public void setAreaPerimetro(double areaPerimetro) {
			this.areaPerimetro = areaPerimetro;
		}

}




