package PacoteJava;

import java.util.Scanner;

/*4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.*/

public class Exercicio4 
{
 
	public static void main(String args[]) 
	{
		int idade, sexo, fp, numpessoas=1, a=0, b=0, c=0, d=0, e=0, f=0; 
		Scanner ler = new Scanner(System.in);
		
		while(numpessoas<=2) 
		{			
			System.out.println("Digite  a idade ");
			idade = ler.nextInt();			

			while(idade<=0 || idade>=130)
			{
				System.out.println("Digite novamente uma idade valida! ");
				idade = ler.nextInt();			
			}
			
			System.out.println("Digite o sexo: 1-Feminino 2-Maculino 3-Outros");
			sexo = ler.nextInt();
			while(sexo<1 || sexo>3)
			{
				System.out.println("Digite novamente sexo valido! ");
				sexo = ler.nextInt();	
			}
			
			System.out.println("Digite o fator psicologico: 1-Calmo(a) 2-Nervoso(a) 3-Agressivo(a)");
			fp = ler.nextInt();
			while(sexo<1 || sexo>3)
			{
				System.out.println("Digite fator psicologico valido! ");
				fp = ler.nextInt();	
			}
			if(fp==1)
			{
				a++;
			}
			if(sexo == 1 && fp == 2)
			{
				b++;
			}
			if(sexo == 2 && fp == 3)
			{
				c++;
			}
			if(sexo == 3 && fp == 1)
			{
				d++;
			}
			if(fp == 2 && idade>40)
			{
				e++;
			}
			if(fp == 1 && idade<18)
			{
				f++;
			}
			numpessoas++;
		
		}
		System.out.println("\nPessoas calmas: "+a+"");
		System.out.println("\nMulher(es) nervosa(s): "+b+"");
		System.out.println("\nHomem(ens) agressivo(s): "+c+"");
		System.out.println("\nOutros calmo(s): "+d+"");
		System.out.println("\nPessoas nervosas com mais de 40 anos: "+e+"");
		System.out.println("\nPessoas calmas com menos de 18 anos: "+f+"");
			
			
		
	}
}