package pksantos.listacriacaodev.desafiooito;
import java.util.Scanner;
public class desafioOito {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado do triângulo.");
		double lado1 = entrada.nextDouble();
		System.out.println("Informe o segundo lado do triângulo.");
		double lado2 = entrada.nextDouble();
		System.out.println("Informe o terceiro lado do triângulo.");
		double lado3 = entrada.nextDouble();
		
		if(lado1 == lado2 || lado1 == lado3 || lado2 == lado1 || lado2 == lado3 || lado3 == lado1
				|| lado3 == lado2) {
			System.out.println("O triângulo é isósceles!");
		}
		else if(lado1 == lado2 && lado1 == lado3 && lado2 == lado1 && lado2 == lado3 && lado3 == lado1
				&& lado3 == lado2) {
			System.out.println("O triângulo é equilátero!");
		}
		else {
			System.out.println("O triangulo é escaleno!");
		}
	}
}
