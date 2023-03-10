package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pedido;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Codigo pedido: ");
		int cod = sc.nextInt();
		Pedido pedido = new Pedido(cod);
		System.out.print("Quantos produtos? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.print("Nome do produto:");
			String nomeProd = sc.nextLine();
			System.out.print("Pre?o do produto:");
			double precoProd = sc.nextDouble();
			System.out.print("Quantidade do produto:");
			int quantidadeProd = sc.nextInt();
			Produto produto = new Produto(nomeProd, precoProd, quantidadeProd);
			pedido.addProduto(produto);
			System.out.println(produto.getNome() + " Adicionado");
		}
		System.out.println(pedido.toString());

		sc.close();

	}

}
