package pksantos.listacriacaodev.desafiotres;
import java.util.Scanner;
import java.text.DecimalFormat; 

public class desafioTres {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.0");
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        double Celsius;
        Celsius = entrada.nextInt();
        
        double Farenheit = Celsius * 1.8 + 32;
        
        System.out.println("A temperatura em Farenheit é: " + df.format(Farenheit) + "°F");
        
	}
}
