package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pessoas> pessoas = new ArrayList<>();
		Pessoas p1 = new Pessoas("anderson");
		Pessoas p2 = new Pessoas("leandro");
		Pessoas p3 = new Pessoas("martins");

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);

		for (Pessoas p : pessoas) {
			System.out.println(p.getNome());
		}

		Scanner sc = new Scanner(System.in);

		System.out.print("quantas buscas serão feitas? ");
		int x = sc.nextInt();
		sc.nextLine();
		int i = 0;

		while (i < x) {
			boolean encontrado = false;
			System.out.print("Nome procurado");
			String procurado = sc.next();
			for (Pessoas p : pessoas) {
				if (p.getNome().contains(procurado)) {
					System.out.println("Encontrado " + p.getNome());
					i++;
					encontrado = true;
					break;
				}
			}
			if (encontrado == false) {
				System.out.println("Não encontrado, digite novamente!");
			}
		}
		sc.close();
	}

}
