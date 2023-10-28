package service;

import java.util.ArrayList;
import java.util.List;

import poo.Produto;

public class ServiceProduto {
	 
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public List<Produto> pegarProdutos(){
		
		return produtos;
	}
	 
	public String inserirProduto(Produto produto) {
	 
		 try{
			 produtos.add(produto);
			 return "Produto adicionado com sucesso!";
		 }catch(Exception erro){
			 return "Erro ao adicionar produto!";
		 }	 
	 }
	
	public Produto pegarProduto(int posicao) {
		Produto produto = produtos.get(posicao);;
		return produto;
	}
	public String alterarProduto(int posicao, Produto produto) {
		try {
			produtos.set(posicao, produto);
			return "Produto alterado com sucesso!";
		} catch (Exception erro) {
			return "Erro ao alterar Produto!";
		}
	}
	public String removerProduto(int posicao) {
		try {
			produtos.remove(posicao);
			return "Produto removido com sucesso";
		} catch (Exception erro) {
			return"Erro ao remover Produto";
		}
	}
}
