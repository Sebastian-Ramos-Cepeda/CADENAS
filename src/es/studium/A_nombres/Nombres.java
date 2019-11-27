package es.studium.A_nombres;

import java.util.Scanner;

public class Nombres 
{
	public static void main(String[] args) 
	{
		String nombre1;
		String nombre2 = "";
		String nombre3 = new String();
		String nombre4 = new String("");
		String nombre5;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena:");
		nombre1 = teclado.next();
		System.out.println("Dame otra cadena:");
		nombre2 = teclado.next();
		System.out.println("Dame otra cadena más:");
		nombre3 = teclado.next();
		System.out.println("Dame otra más:");
		nombre4 = teclado.next();
		System.out.println("Dame una última:");
		nombre5 = teclado.next();
		System.out.println(String.format("Las cadenas son \"%s\", \"%s\", \"%s\", \"%s\" y \"%s\"", nombre1, nombre2, nombre3, nombre4, nombre5));
		teclado.close();
	}
}
