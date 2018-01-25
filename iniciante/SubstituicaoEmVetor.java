/* 
 * Por Kevin Scaccia
 * Resolução do problema 1172 - URI Judge
 * Nível iniciante
 *
 */
import java.util.Scanner;

public class SubstituicaoEmVetor{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x[] = new int[10];// aloca vetor
	
		for(int i=0; i<10; i++){// entrada
			x[i] = scanner.nextInt();
		}

		for(int i=0; i<10; i++){// saida
			int formatado = x[i];// variavel auxiliar
			if(formatado <= 0)
				formatado = 1;
			// saida formatada
			System.out.printf("X[%d] = %d\n", i, formatado);
		}
	}
}