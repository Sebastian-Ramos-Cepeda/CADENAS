package es.studium.H_Subcadena;

import java.util.Scanner;

public class Subcadena 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;
		int longitud, posicion, aux;
		System.out.println("Indique una frase: ");
		cadena = teclado.nextLine();
		System.out.println("Indique la posicion en la que comienza la subcadena (>0)" );
		posicion = teclado.nextInt();
		aux =cadena.length();
		System.out.println("Indique la longitud de la subcadena (<"+aux+")");
		longitud = teclado.nextInt();
		
		System.out.println(subcadena (cadena,posicion,longitud));
		teclado.close();
	}
	public static String subcadena(String cadena, int posIni, int longi)
	{
		return (cadena.substring(posIni, (posIni+longi-1)));
	}
}
