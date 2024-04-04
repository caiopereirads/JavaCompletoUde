import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
		Scanner novo = new Scanner(System.in);
		
		int n1;
		int n2;
		int soma;
		
		n1 = novo.nextInt();
		n2 = novo.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("A soma de "+n1+" com "+n2+" é igual a: "+soma);
				
				
		novo.close();
	}

}
