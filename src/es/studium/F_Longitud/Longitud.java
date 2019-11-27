package es.studium.F_Longitud;

import java.util.Scanner;

public class Longitud 
{
	public static void main(String[] args) 
	{
		String frase;
		int longitudConEspacios, longitudSinEspacios;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique una frase:");
		//nextLine lee una frase
		frase=teclado.nextLine();
		longitudConEspacios = calcularLongitud1(frase);
		System.out.println("La longitud con espacios es de: " + longitudConEspacios);
		longitudSinEspacios = calcularLongitud2(frase);
		System.out.println("La longitud sin espacios es de: " + longitudSinEspacios);
		teclado.close();
	}
	
	public static int calcularLongitud1(String cadena)
	{
		int resultado = 0;
		//resultado = cadena.length();
		for(int i=0;i<cadena.length();i++)
		{
			resultado++;
		}
		return resultado;
	}
	
	public static int calcularLongitud2(String cadena)
	{
		int resultado = 0;
		for(int i=0;i<cadena.length();i++)
		{
			if(cadena.charAt(i)!=' ')
			{
				resultado++;
			}
		}
		return resultado;
	}
}
