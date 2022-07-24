package pksantos.listacriacaodev.desafioum;
import java.util.Scanner;
public class desafioUm {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        double raio;
        
        System.out.println("Digite o raio do círculo: ");
        raio = entrada.nextInt();
        
        double Diametro = raio * 2;
        double Perimetro = Diametro * 3.14;
        double Area = 3.14 * (raio * raio);
        
        System.out.println("O perimetro do seu círculo é de: " + Perimetro);
        System.out.println("A área do seu círculo é de " + Area);
        
	}
}
