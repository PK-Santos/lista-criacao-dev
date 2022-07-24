package pksantos.listacriacaodev.desafiosete;
import java.util.Scanner;
import java.util.Arrays;
public class desafioSete {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite um número: ");
		int numero2 = entrada.nextInt();

		System.out.println("Digite um número: ");
		int numero3 = entrada.nextInt();
		
		int[] numeros = new int[]{numero1, numero2, numero3};
		
		Arrays.sort(numeros);
		
		for(int numero : numeros ) {
			System.out.println(numero);			
		}
		
	}
}
