package es.studium.D_May�sculas_Min�sculas;

import java.util.Scanner;

public class May�sculas_Min�sculas 
{
	public static void main(String[] args) 
	{
		String cadena1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una cadena mezclando may�sculas y min�sculas:");
		cadena1 = teclado.next();
		//Convertir en may�sculas
		System.out.println("May�sculas: "+ cadena1.toUpperCase());
		//Convertir en min�sculas
		System.out.println("Min�sculas: "+ cadena1.toLowerCase());
		teclado.close();
	}
}
