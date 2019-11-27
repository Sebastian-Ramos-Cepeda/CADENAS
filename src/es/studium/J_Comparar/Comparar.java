package es.studium.J_Comparar;

import java.util.Scanner;

public class Comparar 
{
	public static void main(String[] args) 
	{
		String cadena1, cadena2;
		int resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena:");
		cadena1 = teclado.next();
		System.out.println("Dame otra cadena:");
		cadena2 = teclado.next();
		
		resultado = cadena1.compareTo(cadena2);
		
		if (resultado<0) 
		{
			System.out.println(cadena1 + " está por delante alfabeticament que " + cadena2);
		}
		else if(resultado>0)
		{
			System.out.println(cadena2 + " está por delante alfabeticament que " + cadena1);
		}
		teclado.close();
	}
}
