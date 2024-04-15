package arraysjava;

import java.util.Scanner;

public class ArraysJava {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Introduzca una longitud para el array");
		int longitud = scnr.nextInt();

		int Array[] = new int[longitud];

		int num = 0;

		for (int i = 0; i < Array.length; i++) {

			System.out.println("Inserte un numero el la posicion " + i);

			do {

				num = scnr.nextInt();

				if (!(num > 0 && num < 10)) {
					System.out.println("Error. Solo numeros del 0 al 10. "
						+ "Inserte un numero en la posicion " + i);
				}

			} while (!(num > 0 && num < 10));
			
			Array [i] = num;
			

		}
		
		System.out.println("Los numeros elegidos son los siguientes");
		for (int i = 0; i < Array.length; i++) {
			
			System.out.println(Array [i]);
			
		}

	}

}
