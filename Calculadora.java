import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int NSoma1 = 0;
		int NSoma2 = 0;
		int NSub1 = 0;
		int NSub2 = 0;
		int soma = 0;
 		int subtracao = 0;
		
		System.out.print("Digite o primeiro numero para a soma: ");
		NSoma1 = entrada.nextInt();
		System.out.print("Digite o segundo numero para a soma: ");
		NSoma2 = entrada.nextInt();
        System.out.print("Digite o primeiro numero para a subtracao: ");
		NSub1 = entrada.nextInt();
		System.out.print("Digite o segundo numero para a subtracao: ");
		NSub2 = entrada.nextInt();
		
		soma = Entrada1+Entrada2;
		subtracao = Entrada1-Entrada2;
      
		System.out.printf("O Resultado da soma: %d\n",soma);
     	System.out.printf("O Resultado da subtracao: %d\n",subtracao);
	}
}