package pksantos.listacriacaodev.desafioum;
import java.util.Scanner;

//Nome de Classe sempre comeca com letra maiuscula
public class DesafioUm {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        double raio;
        
        System.out.println("Digite o raio do c�rculo: ");
        raio = entrada.nextInt();
        
        //nome de variavel sempre comeca com letra minuscula 
        double diametro = raio * 2;
        double perimetro = diametro * 3.14;
        double area = 3.14 * (raio * raio);
        
        System.out.println("O perimetro do seu c�rculo � de: " + perimetro);
        System.out.println("A �rea do seu c�rculo � de " + area);
        
	}
}
