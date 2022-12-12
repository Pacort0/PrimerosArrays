package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int tabla [] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			System.out.print("Introduzca un valor entero: ");
			tabla[i] = sc.nextInt();
		}
		
		for(int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}
		sc.close();
	}

}
