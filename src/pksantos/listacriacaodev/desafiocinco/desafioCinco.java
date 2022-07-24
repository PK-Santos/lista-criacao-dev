package pksantos.listacriacaodev.desafiocinco;
import java.util.Scanner;
public class desafioCinco {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//será adicionado o valor de cada nota e multiplicado pelo peso da matéria
		System.out.println("Informe sua nota em matemática: ");
		double matematica = entrada.nextDouble() * 3;
		System.out.println("Informe sua nota em física: ");
		double fisica = entrada.nextDouble() * 2.5;
		System.out.println("informe sua nota em química: ");
		double quimica = entrada.nextDouble() * 2.5;
		System.out.println("Informe sua nota em português: ");
		double portugues = entrada.nextDouble() * 1;
		System.out.println("Informe sua nota em inglês: ");
		double ingles = entrada.nextDouble() * 1;
		
		double media = (matematica + fisica + quimica + portugues + ingles) / (3 + 2.5 + 
				2.5 + 1 + 1);
		
		System.out.println("Sua média final foi de : " + media);
	}
}
