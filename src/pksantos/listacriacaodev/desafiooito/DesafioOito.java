package pksantos.listacriacaodev.desafiooito;

import java.util.Scanner;

public class DesafioOito {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro lado do tri�ngulo.");
		double lado1 = entrada.nextDouble();
		System.out.println("Informe o segundo lado do tri�ngulo.");
		double lado2 = entrada.nextDouble();
		System.out.println("Informe o terceiro lado do tri�ngulo.");
		double lado3 = entrada.nextDouble();

		//Primeiro verifica se todos são iguais
		// se não quando todos forem iguais e o (if) do isosceles estiver na frente, ele vai cair no isosceles e vai dar errado (já que quando todos são iguais 2 lados também são iguais).
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("O tri�ngulo � equil�tero!");
		} 
		//Já sabemos que não são todos iguais, agora sim verificamos se pelo menos dois são iguais.
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado1 || lado2 == lado3 || lado3 == lado1
				|| lado3 == lado2) {
			System.out.println("O tri�ngulo � is�sceles!");
		}
		else {
			System.out.println("O triangulo � escaleno!");
		}
	}
}
