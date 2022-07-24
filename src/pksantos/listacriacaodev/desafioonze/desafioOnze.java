package pksantos.listacriacaodev.desafioonze;
import java.util.Scanner;
public class desafioOnze {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		double A = entrada.nextDouble();
		if (A == 0) {
			System.out.println("A equa��o n�o � do segundo grau!");
			System.exit(0);
		}
		System.out.println("Informe o valor de B: ");
		double B = entrada.nextDouble();
		System.out.println("Informe o valor de C: ");
		double C = entrada.nextDouble();
		double delta = Math.pow(B, 2) - (4 * A * C);
		double Raiz1 = 0;
		double Raiz2 = 0;
		if(delta < 0) {
			System.out.println("A equa��o n�o possui raizes reais!");
			System.exit(0);
		}
		
		if(delta == 0) {
			System.out.println("A equa��o possui apenas uma raiz real, que �: " + (-B / (2 * A)));
			System.exit(0);
		}
		
		if(delta > 0) {
			System.out.println(Math.sqrt(delta));
			Raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
			Raiz2 = (-B - Math.sqrt(delta)) / (2 * A); 
			System.out.println("A equa��o possui duas raizes reais que s�o: " + Raiz1 + " e "
					+ Raiz2);
		}
		
	}
}
