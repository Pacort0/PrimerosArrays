package ejercicios;

public class Ejercicio08 {

	public static void main(String[] args) {
		int numeros[] = new int[20];
		double cuadrados[] = new double[20];
		double cubos[] = new double[20];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*100);
			cuadrados[i] = Math.pow(numeros[i], 2);
			cubos[i] = Math.pow(numeros[i], 3);
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(i + 1 + ". " + numeros [i] + " \t " + cuadrados[i] + "\t  " + cubos[i]);
		} 
	}

}
