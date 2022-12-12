package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		double tabla[] = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			System.out.print("Introduzca un número decimal: ");
			tabla[i] = sc.nextDouble();
		}
		for(double numero: tabla) {
			System.out.println(numero);
		}
		sc.close();
	}

}
