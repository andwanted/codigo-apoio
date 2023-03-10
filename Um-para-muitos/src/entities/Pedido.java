package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Integer numeroPedido;
	List<Produto> produtos = new ArrayList<>();

	public Pedido() {

	}

	public Pedido(Integer numeroPedido) {

		this.numeroPedido = numeroPedido;
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public void addProduto(Produto produto) {
		produtos.add(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}

	public double total() {
		double soma = 0.0;
		for (Produto produto : produtos) {
			soma += produto.somaProduto();
		}
		return soma;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo do pedido: " + numeroPedido + "\n");
		sb.append("Produtos no pedido: " + produtos.size() + "\n");
		for (Produto produto : produtos) {
			sb.append(produto + "\n");
		}
		sb.append("Total pedido: " + String.format("%.2f", total()));
		return sb.toString();
	}

}
