package poo;

import java.util.Scanner;

import service.ServiceProduto;

public class Main {
	static ServiceProduto produtos = new ServiceProduto();
    static Print print = new Print();
	public static void main(String[] args) {
		print.bemVindo();	
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		int posicao ;
		String retorno = "";
		
		while(opcao != -1) {
			print.menu();
			opcao = scan.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite a descrição do produto : ");
				String descricao = scan.next();
				
				System.out.println("Digite o valor do produto : ");
				double valor = scan.nextDouble();	
				
				Produto produto = new Produto(descricao,valor);
				
				retorno =  produtos.inserirProduto(produto);
				print.retorno(retorno);
				break;
			case 2:
				System.out.println("Digite a posição do que produto deseja remover: ");
				posicao = scan.nextInt();
				retorno = produtos.removerProduto(posicao);
				print.retorno(retorno);
				break;
			case 3:
				System.out.println("Digite a posição do que produto deseja alterar: ");
				posicao = scan.nextInt();
				
				System.out.println("Digite a nova descrição do produto : ");	
				String novaDescricao = scan.next();
				
				System.out.println("Digite o novo valor do produto : ");
				double novoValor = scan.nextDouble();
				
				Produto novoProduto = new Produto(novaDescricao, novoValor);
				
				retorno = produtos.alterarProduto(posicao,novoProduto);
				print.retorno(retorno);
				break;
			case 4:
				print.imprimeProdutos(produtos);
				break;
			case 5:
				System.out.println("Digite a posição do que produto deseja selecionar: ");
				posicao = scan.nextInt();
				print.imprimeProduto(produtos, posicao);
				break;
			default:
				print.fechaPrograma();
				scan.close();
				opcao = -1;
			}
		}
		
	}

}
