package entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private List<Pessoa> pessoas = new ArrayList<>();
	private List<Pessoa> pessoasCadastradas = new ArrayList<>();

	private String nome;

	public Pessoa() {

	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public List<Pessoa> getPessoasCadastradas() {
		return pessoasCadastradas;
	}

	public void addPessoas(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	public void addPessoasCadastradas(Pessoa pessoaCadastrada) {
		pessoasCadastradas.add(pessoaCadastrada);
	}

}
