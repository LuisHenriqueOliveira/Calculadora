import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int Entrada1 = 0;
		int Entrada2 = 0;
		int soma = 0;
      int subtracao = 0;
		
		System.out.print("Digite o primeiro numero: ");
		Entrada1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		Entrada2 = entrada.nextInt();
		
		soma = Entrada1+Entrada2;
		subtracao = Entrada1+Entrada2;
		System.out.printf("O Resultado da soma: %d\n",soma);
      System.out.printf("O Resultado da subtracao: %d\n",subtracao);
	}
}