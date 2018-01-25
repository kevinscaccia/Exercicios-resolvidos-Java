/* 
 * Por Kevin Scaccia
 * Resolução do problema 1018 - URI Judge
 * Nível iniciante
 *
 */
import java.util.Scanner;

public class Cedulas{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();// atribui a entrada à variável total
		int auxiliar = total;// usada para mostrar o valor no output
		// variaveis que armazenarão a quantidade de cada nota
		int qtdNota_um = 0;
		int qtdNota_dois = 0;
		int qtdNota_cinco = 0;
		int qtdNota_dez = 0;// seria mais elegante utilizar um array :) 
		int qtdNota_vinte = 0;
		int qtdNota_cinquenta = 0;
		int qtdNota_cem = 0;

		// enquanto total for > 100, subtrai dele 100( ou seja, usa uma nota de 100)
		while(total >= 100){
			total = total - 100;
			qtdNota_cem++;
		}
		// enquanto total for > 50, subtrai dele 50( ou seja, usa uma nota de 50)
		while(total >= 50){
			total = total - 50;
			qtdNota_cinquenta++;
		}
		while(total >= 20){
			total = total - 20;
			qtdNota_vinte++;
		}
		while(total >= 10){
			total = total - 10;
			qtdNota_dez++;
		}
		while(total >= 5){
			total = total - 5;
			qtdNota_cinco++;
		}
		while(total >= 2){
			total = total - 2;
			qtdNota_dois++;
		}
		// o que restou é decomposto em notas de um
		qtdNota_um = total;

		// Saida formatada da quantidade de cada tipo de nota
		System.out.printf("%d\n", auxiliar);// valor total inicial
		System.out.printf("%d nota(s) de R$ 100,00\n", qtdNota_cem);
		System.out.printf("%d nota(s) de R$ 50,00\n", qtdNota_cinquenta);
		System.out.printf("%d nota(s) de R$ 20,00\n", qtdNota_vinte);
		System.out.printf("%d nota(s) de R$ 10,00\n", qtdNota_dez);
		System.out.printf("%d nota(s) de R$ 5,00\n", qtdNota_cinco);
		System.out.printf("%d nota(s) de R$ 2,00\n", qtdNota_dois);
		System.out.printf("%d nota(s) de R$ 1,00\n", qtdNota_um);
	}
}