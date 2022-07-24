package pksantos.listacriacaodev.desafiodois;
import java.util.Scanner;
public class desafioDois {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as horas: ");
		int hora = entrada.nextInt();
		System.out.println("Informe os minutos: ");
		int minuto = entrada.nextInt();
		
		int qtMinuto = hora * 60;
		int qtSegundo = qtMinuto * 60;
	
		System.out.println("A quantidade de horas em minutos é: " + qtMinuto);
		System.out.println("A quantidade de minutos em segundos é: " + qtSegundo);
	}

}
