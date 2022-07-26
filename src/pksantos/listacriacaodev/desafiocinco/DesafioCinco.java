package pksantos.listacriacaodev.desafiocinco;
import java.util.Scanner;
public class DesafioCinco {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//ser� adicionado o valor de cada nota e multiplicado pelo peso da mat�ria
		System.out.println("Informe sua nota em matem�tica: ");
		double matematica = entrada.nextDouble() * 3;
		System.out.println("Informe sua nota em f�sica: ");
		double fisica = entrada.nextDouble() * 2.5;
		System.out.println("informe sua nota em qu�mica: ");
		double quimica = entrada.nextDouble() * 2.5;
		System.out.println("Informe sua nota em portugu�s: ");
		double portugues = entrada.nextDouble() * 1;
		System.out.println("Informe sua nota em ingl�s: ");
		double ingles = entrada.nextDouble() * 1;
		
		double media = (matematica + fisica + quimica + portugues + ingles) / (3 + 2.5 + 
				2.5 + 1 + 1);
		
		System.out.println("Sua m�dia final foi de : " + media);
	}
}
