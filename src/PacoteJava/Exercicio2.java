package PacoteJava;
/*2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/


import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n, i, cont1 = 0, cont2 = 0;
		
		for(i=0; i<10; i++)
		{
			System.out.println("Entre com o valor: ");
			n = ler.nextInt();
			if(n%2 == 0)
				cont1++;
			else
				cont2++;
		}
		System.out.println("Quantidade de pares: "+cont1+", quantidade de impares: "+cont2+"");
	}
		
}