package es.studium.K_Mayor;

import java.util.Scanner;

public class Mayor 
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2, cadena3, cadena4, cadena5;
		System.out.println("Indica la primera cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Indica la segunda cadena:");
		cadena2 = teclado.nextLine();
		System.out.println("Indica la tercera cadena:");
		cadena3 = teclado.nextLine();
		System.out.println("Indica la cuarta cadena:");
		cadena4 = teclado.nextLine();
		System.out.println("Indica la quinta cadena:");
		cadena5 = teclado.nextLine();
		
		cadena1.compareTo(cadena2);
	}
}
