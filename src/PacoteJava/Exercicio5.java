package PacoteJava;
import java.util.Scanner;
/*5 Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/

public class Exercicio5 {
	public static void main(String args[]) 
	{
		double n, soma=0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Entre com o valor: ");
			n = ler.nextDouble();
			soma = soma + n;
		}while(n!=0);
		System.out.println("Soma: "+soma+"");

	}
}
