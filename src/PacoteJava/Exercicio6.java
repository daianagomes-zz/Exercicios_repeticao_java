package PacoteJava;
import java.util.Scanner;
/*6-Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

public class Exercicio6
{
	public static void main(String args[]) 
	{
		double n, soma=0, media, cont=0;
		Scanner ler = new Scanner(System.in);

		do 
		{
			System.out.println("Entre com o valor: ");
			n = ler.nextInt();
			if(n%3==0)
			{	soma = soma + n;
				cont++;
			}
			
		}while(n!=0);
		media = soma/cont;
		System.out.println("Media: "+media+"");
		

	}
}