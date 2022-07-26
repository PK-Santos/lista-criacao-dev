package pksantos.listacriacaodev.desafioseis;
import java.util.Scanner;
public class DesafioSeis {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um n�mero positivo ou negativo: ");
		int numero = entrada.nextInt();
		
		if(numero > 0) {
			
			System.out.println("O n�mero digitado � positivo!");
		}
		else {
			System.out.println("O n�mero digitado � negativo!");
		}
	}
}
