import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		float Entrada1 = 0;
		float Entrada2 = 0;
		float soma = 0;
		
		System.out.print("Digite o primeiro numero: ");
		Entrada1 = entrada.nextFloat();
		System.out.print("Digite o segundo numero: ");
		Entrada2 = entrada.nextFloat();
		
		soma = Entrada1+Entrada2;
		
		System.out.printf("%.2f\n",soma);
	}
}