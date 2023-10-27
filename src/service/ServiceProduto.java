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
		 }catch(Exception erro){
			 return "Erro ao adicionar produto!";
		 }finally {
			 return "Produto adicionado com sucesso!";
		 }
		 
	 }
	
	public Produto pegarProduto(int posicao) {
		Produto produto = produtos.get(posicao);;
		return produto;
	}
	public String alterarProduto(int posicao,Produto produto) {
		try {
			produtos.set(posicao, produto);
		}catch(Exception erro) {
			return "Erro ao alterar Produto!";
		}finally{
			return"Produto alterado com sucesso!";
		}
	}
	public String removerProduto(int posicao) {
		 
		 try{
			 produtos.remove(posicao);
		 }catch(Exception erro){
			 return "Erro ao remover Produto";
		 }finally {
			 return "Produto removido com sucesso";
		 }
		 
	 }
}
