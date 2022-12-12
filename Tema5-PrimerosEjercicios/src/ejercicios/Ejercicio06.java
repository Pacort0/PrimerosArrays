package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int tabla[] = new int[8];
		
		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			System.out.print("Introduzca un número entero: ");
			tabla[i] = sc.nextInt();
		}
		
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i] % 2 == 0) {
				System.out.println("El número " + tabla [i] + " es par.");
			}
			else {
				System.out.println("El número " + tabla[i] + " es impar.");
			}
		}
		sc.close();
	}

}
