package pksantos.listacriacaodev.desafionove;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class desafioNove {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de minutos que o veículo permaneceu no "
				+ "estacionamento");
		double minutos = entrada.nextDouble();
		double custo;
		double minutosDiferenca = minutos - 120;
		
		if (minutos <= 60) {
			custo = 2;
			System.out.println("O valor total a pagar é: " + new DecimalFormat("#0").format(custo) 
					+ " Reais.");
		}
		
		if (minutos > 60 && minutos <= 120) {
			custo = 3.5;
			System.out.println("O valor total a pagar é: " + new DecimalFormat("#,##0.00").format(custo) 
					+ " Reais.");
		}
		
		if (minutos > 120) {
			custo = 3.5 + (0.0166666666666667 * minutosDiferenca);
			System.out.printf("O valor total a pagar é: R$" 
			+ new DecimalFormat("#,##0.00").format(custo) + " Reais.");
		}
	}
}
