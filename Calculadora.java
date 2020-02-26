import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int NSoma1 = 0;
		int NSoma2 = 0;
		int NSub1 = 0;
		int NSub2 = 0;
		int NMult1 = 0;
		int NMuilt2 = 0;
		float NDiv1 = 0;
		float NDiv2 = 0;
		int soma = 0;
        int subtracao = 0;
        int multiplicacao = 0;
        float divisao = 0;
		
		System.out.print("Digite o primeiro numero para a soma: ");
		NSoma1 = entrada.nextInt();
		System.out.print("Digite o segundo numero para a soma: ");
		NSoma2 = entrada.nextInt();
        System.out.print("Digite o primeiro numero para a subtracao: ");
		NSub1 = entrada.nextInt();
		System.out.print("Digite o segundo numero para a subtracao: ");
		NSub2 = entrada.nextInt();
        System.out.print("Digite o primeiro numero para a multiplicacao: ");
		NMult1 = entrada.nextInt();
		System.out.print("Digite o segundo numero para a multiplicacao: ");
		NMulti2 = entrada.nextInt();
        System.out.print("Digite o primeiro numero para a divisao: ");
		NDiv1 = entrada.nextFloat();
		System.out.print("Digite o segundo numero para a divisao: ");
		NDiv2 = entrada.nextFloat();
		
		soma = Entrada1+Entrada2;
		subtracao = Entrada1-Entrada2;
        multiplicacao = Entrada1*Entrada2;
        divisao = Entrada1/Entrada2;
      
		System.out.printf("O Resultado da soma: %d\n",soma);
        System.out.printf("O Resultado da subtracao: %d\n",subtracao);
        System.out.printf("O Resultado da multiplicacao: %d\n",multiplicacao);
        System.out.printf("O Resultado da divisao: %.4f\n",divisao);
	}
}