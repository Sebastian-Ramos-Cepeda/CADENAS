package es.studium.I_Subcadena2;

import java.util.Scanner;

public class Subcadena2 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;
		int numCaracteres;
		int posInicio;
		System.out.println("Indique una frase: ");
		cadena = teclado.nextLine();
		System.out.println("Indique la cantidad de caracteres a recuperar, entre 1 y " + cadena.length());
		numCaracteres = teclado.nextInt();
		posInicio = cadena.length();
		System.out.println("INDEX*CARACTER");
		for(int i=0;i<cadena.length();i++) 
		{
			System.out.println(i+"*"+cadena.charAt(i));
		}
		System.out.println("LONGITUD= "+cadena.length());
		System.out.println("CANTIDAD CARACTERES= "+numCaracteres);
		System.out.println("POSICION INICIAL (INDEX)=LONGITUD-CANT.= "+posInicio);
		
		System.out.println(cadena.substring(posInicio,cadena.length()));
		
		teclado.close();
	}
}
