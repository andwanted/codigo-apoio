package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();

		System.out.print("Quantas pessoas ira adicionar? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Pessoa: ");
			String nome = sc.next();
			Pessoa p1 = new Pessoa(nome);
			pessoa.addPessoas(p1);
		}

		for (Pessoa pessoas : pessoa.getPessoas()) {
			System.out.println("Nome: " + pessoas.getNome());
		}

		System.out.print("Cadastradar pessoa: ");
		String nomeCadastro = sc.next();

		for (Pessoa pessoas : pessoa.getPessoas()) {
			if (nomeCadastro.equals(pessoas.getNome())) {
				System.out.println("Posição encontrada");
				Pessoa p2 = new Pessoa(nomeCadastro);
				pessoa.addPessoasCadastradas(p2);
				System.out.println("Pessoa cadastrada: " + p2.getNome());
			}
		}
		System.out.println("Não encontramos " + nomeCadastro + " na lista");
		
		
		sc.close();

	}

}
