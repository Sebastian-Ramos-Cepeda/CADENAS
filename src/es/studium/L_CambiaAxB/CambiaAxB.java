package es.studium.L_CambiaAxB;

import java.util.Scanner;

public class CambiaAxB 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;
			
		System.out.println("Dame una cadena:");
		cadena = teclado.nextLine();
		
		System.out.println(cadena.replace("a", "o"));
		
		teclado.close();
	}
}
