package entities;

public class Produto {
	private String nome;
	private Double preco;
	private Integer quantidade;

	public Produto() {

	}

	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public double somaProduto() {
		return preco * quantidade;
	}

	public String toString() {
		return "Produto: " + nome + " Pre�o: " + String.format("%.2f", preco) + " Quantidade: " + quantidade + " Total: "
				+ String.format("%.2f", somaProduto());
	}

}
