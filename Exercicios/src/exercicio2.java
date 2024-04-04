import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/
		
		Scanner scan = new Scanner(System.in);
		
		double raio;
		double area;
		final double PI = 3.14159;
		
		System.out.println("Escreva o valor do raio: ");
		
		raio = scan.nextFloat();
		
		area = PI * (raio*raio);
		
		System.out.println("O valor da área é: "+area);
		
		scan.close();
	}

}
