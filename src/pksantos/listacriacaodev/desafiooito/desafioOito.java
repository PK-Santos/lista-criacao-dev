package pksantos.listacriacaodev.desafiooito;
import java.util.Scanner;
public class desafioOito {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado do tri�ngulo.");
		double lado1 = entrada.nextDouble();
		System.out.println("Informe o segundo lado do tri�ngulo.");
		double lado2 = entrada.nextDouble();
		System.out.println("Informe o terceiro lado do tri�ngulo.");
		double lado3 = entrada.nextDouble();
		
		if(lado1 == lado2 || lado1 == lado3 || lado2 == lado1 || lado2 == lado3 || lado3 == lado1
				|| lado3 == lado2) {
			System.out.println("O tri�ngulo � is�sceles!");
		}
		else if(lado1 == lado2 && lado1 == lado3 && lado2 == lado1 && lado2 == lado3 && lado3 == lado1
				&& lado3 == lado2) {
			System.out.println("O tri�ngulo � equil�tero!");
		}
		else {
			System.out.println("O triangulo � escaleno!");
		}
	}
}
