package pksantos.listacriacaodev.desafiodez;
import java.util.Scanner;
public class desafioDez {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu sal�rio: ");
		double salario = entrada.nextDouble();
		System.out.println("Informe o valor total de gastos: ");
		double totalGasto = entrada.nextDouble();
		
		if(totalGasto <= salario) {
			System.out.println("Os gastos est�o dentro do or�amento!");
		}
		else {
			System.out.println("O or�amento est� estourado!");
		}
	}
}
