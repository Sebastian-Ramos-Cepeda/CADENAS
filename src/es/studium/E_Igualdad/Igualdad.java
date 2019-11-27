package es.studium.E_Igualdad;

import java.util.Scanner;

public class Igualdad 
{
	public static void main(String[] args) 
	{
		String cadena1, cadena2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena:");
		cadena1 = teclado.next();
		System.out.println("Dame otra cadena:");
		cadena2 = teclado.next();
		if (cadena1.equals(cadena2))
		{
			System.out.println("Son iguales");
		}
		else 
		{
			System.out.println("Son diferentes");
		}
		teclado.close();
	}
}
