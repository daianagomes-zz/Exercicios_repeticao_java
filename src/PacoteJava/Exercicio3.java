package PacoteJava;
/*3-Solicitar a idade de várias pessoas e imprimir: 
 Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
  O programa termina quando idade for =99. (WHILE)
 */
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, cont1=0, cont2=0;
		
		System.out.println("Entre com a idade: ");
		idade = ler.nextInt();
		while(idade!=99)
		{
			System.out.println("Entre com a idade: ");
			idade = ler.nextInt();
			if(idade<21)
				cont1++;
			else if(idade>50)
				cont2++;
		}
		System.out.println("Quantidade de pessoas com mais de 21 anos: "+cont1+"");
		System.out.println("Quantidade de pessoas com mais de 50 anos: "+cont2+"");


	}

}
