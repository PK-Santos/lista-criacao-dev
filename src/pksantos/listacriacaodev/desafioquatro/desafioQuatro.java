package pksantos.listacriacaodev.desafioquatro;
import java.util.Scanner;
public class desafioQuatro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o ano atual: ");
		int ano = entrada.nextInt();
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		int nascimento = ano - idade;
		
		System.out.println("Seu nascimento foi aproximadamente em: " + nascimento);
	}
}
