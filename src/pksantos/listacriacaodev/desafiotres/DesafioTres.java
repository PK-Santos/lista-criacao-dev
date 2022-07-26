package pksantos.listacriacaodev.desafiotres;
import java.util.Scanner;
import java.text.DecimalFormat; 

//Nome de Classe sempre comeca com letra maiuscula
public class DesafioTres {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.0");
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        //nome de variavel sempre comeca com letra minuscula 
        double celsius;
        celsius = entrada.nextInt();
        
        double farenheit = celsius * 1.8 + 32;
        
        System.out.println("A temperatura em Farenheit �: " + df.format(farenheit) + "�F");
        
	}
}
