package pksantos.listacriacaodev.desafioseis;
import java.util.Scanner;
public class desafioSeis {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um número positivo ou negativo: ");
		int numero = entrada.nextInt();
		
		if(numero > 0) {
			
			System.out.println("O número digitado é positivo!");
		}
		else {
			System.out.println("O número digitado é negativo!");
		}
	}
}
