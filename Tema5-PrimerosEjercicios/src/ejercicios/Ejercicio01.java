package ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		int tabla [] = new int[10];
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100);
			System.out.println(tabla[i]);
		}
	}

}
