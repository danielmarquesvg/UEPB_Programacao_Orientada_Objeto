package aulaDiagramaDeClasse;

import java.util.ArrayList;

public class Carrinho {

	//atributos
	private ArrayList <Produto> listaDeProdutos = new ArrayList<Produto>();
	private double valorTotalDaCompra;
	
	//Construtor
	public Carrinho() {}
	
	//metodos
	public void adicionarProduto(Produto novoProduto) {
		listaDeProdutos.add(novoProduto);
	}

	public void removerProduto(String nomeDoProduto) {
		int posicao = buscarProduto(nomeDoProduto);
		
		if(posicao == -1) {
			System.out.println("O produto não foi achado");
		} else {
			listaDeProdutos.remove(posicao);
		}
	}

	public int buscarProduto(String nomeDoProduto) {
		boolean flag = false;
		int contador = 0;
		int posicao = -1;
		while(contador < listaDeProdutos.size() && flag == false) {
			if(nomeDoProduto == listaDeProdutos.get(contador).getNome()) {
				flag = true;
				posicao = contador;
			}
			contador = contador + 1;
		}
		return posicao;
	}

	public double getValorTotalDaCompra() {
		double soma = 0;
		for(int i = 0; i < this.listaDeProdutos.size(); i++) {
			soma = soma + (this.listaDeProdutos.get(i).getQuantidade() * this.listaDeProdutos.get(i).getValorUnitario());
		}
		return soma;
	}

}
