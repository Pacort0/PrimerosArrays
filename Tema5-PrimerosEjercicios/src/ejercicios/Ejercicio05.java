package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		double tabla [] = new double[10];
		double mayor, menor;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			System.out.print("Introduzca un valor real: ");
			tabla[i] = sc.nextDouble();
		}
		
		mayor = tabla[0];
		menor = tabla[0];
		
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i] > mayor) {
				mayor = tabla[i];
			}
			else if (tabla[i] < menor){
				menor = tabla[i];
			}
		}
		System.out.println("El número mayor es " + mayor);
		System.out.println("El número menor es " + menor);
		
		sc.close();
	}
}
