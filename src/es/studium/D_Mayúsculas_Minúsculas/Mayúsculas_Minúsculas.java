package es.studium.D_Mayúsculas_Minúsculas;

import java.util.Scanner;

public class Mayúsculas_Minúsculas 
{
	public static void main(String[] args) 
	{
		String cadena1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una cadena mezclando mayúsculas y minúsculas:");
		cadena1 = teclado.next();
		//Convertir en mayúsculas
		System.out.println("Mayúsculas: "+ cadena1.toUpperCase());
		//Convertir en minúsculas
		System.out.println("Minúsculas: "+ cadena1.toLowerCase());
		teclado.close();
	}
}
