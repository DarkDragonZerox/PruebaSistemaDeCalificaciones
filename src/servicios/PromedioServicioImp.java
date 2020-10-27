package servicios;

public class PromedioServicioImp {

	public double calcularPromedio(double input) {
		
		double promedio=0;
		double suma=0;	
		double[] tmpArray = input;
		for (double i=0; i<tmpArray.length;i++) {
			double value= tmpArray[i];
			suma += value;
			promedio=suma/tmpArray.length;
		}
		return promedio;
		
	}

}
