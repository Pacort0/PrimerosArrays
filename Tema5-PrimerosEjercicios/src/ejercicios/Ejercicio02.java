package ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tabla [] = new int[10];
		int suma = 0;
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100);
			suma += tabla[i];
		}
		System.out.print(suma);
	}

}
