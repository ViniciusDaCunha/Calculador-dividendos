package application;

import entities.ativos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		List<ativos> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Vamos começar! Entre com a quantidade de ativos que deseja calcular: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Ativo " + i + ": ");

			System.out.println("Ticker: ");
			sc.nextLine();
			String ticker = sc.nextLine();

			System.out.println("Preço por cota: ");
			double preco = sc.nextDouble();

			System.out.println("Valor investido: ");
			double valorInvestido = sc.nextDouble();

			System.out.println("Entre com o último rendimento de Dividend Yield do ativo: ");
			double dy = sc.nextDouble();

			ativos ativo = new ativos(ticker, preco, valorInvestido, dy);
			lista.add(ativo);

		}

		System.out.println();
		System.out.println("Resultado: ");
		for (ativos ativos : lista) {
			System.out.println(ativos);
		}

		System.out.println("O total de dividendos recebido este mês é: " + String.format("%.2f", somarProventos(lista)));

		sc.close();

	}

	public static double somarProventos(List<ativos> lista) {
         
		/*
		 * for(int i = 0; i < lista.size(); i++) { total += lista.get(i).proventos(); }
		 */
		
		double total = 0;
		for (ativos ativo : lista) {
			total += ativo.proventos();
		}

		return total;
	}
}
