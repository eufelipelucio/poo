package poo;

import java.util.Scanner;

import service.ServiceProduto;

public class Main {
	static ServiceProduto produtos = new ServiceProduto();

	public static void main(String[] args) {
			
		System.out.println("--------------");
		System.out.println("-- Bem Vindo--");
		System.out.println("--------------");
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		int posicao ;
		String retorno = "";
		
		while(opcao != -1) {
			System.out.println("Inserir Produto Digite - 1");
			System.out.println("Remover Produto Digite - 2");
			System.out.println("Alterar Produto Digite - 3");
			System.out.println("Listar Produtos Digite - 4");
			System.out.println("Selecionar um produto Digite - 5");
			System.out.println("Digite qualquer outro número para sair");
			System.out.println();
			opcao = scan.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite a descrição do produto : ");
				String descricao = scan.next();
				
				System.out.println("Digite o valor do produto : ");
				double valor = scan.nextDouble();	
				
				Produto produto = new Produto(descricao,valor);
				
				retorno =  produtos.inserirProduto(produto);
				System.out.println(retorno);
				System.out.println("-------------------------");
				System.out.println();
				break;
			case 2:
				System.out.println("Digite a posição do que produto deseja remover: ");
				posicao = scan.nextInt();
				retorno = produtos.removerProduto(posicao);
				System.out.println(retorno);
				System.out.println("-------------------------");
				System.out.println();
				break;
			case 3:
				System.out.println("Digite a posição do que produto deseja alterar: ");
				posicao = scan.nextInt();
				
				System.out.println("Digite a nova descrição do produto : ");	
				String novaDescricao = scan.next();
				
				System.out.println("Digite o novo valor do produto : ");
				double novoValor = scan.nextDouble();
				
				String nome = new String("felipe");
				
				Produto novoProduto = new Produto(novaDescricao, novoValor);
				
				retorno = produtos.alterarProduto(posicao,novoProduto);
				System.out.println(retorno);
				System.out.println("-------------------------");
				System.out.println();
				break;
			case 4:
				System.out.println("----Lista De Produtos----");
				for(int i = 0; i < produtos.pegarProdutos().size();i++) {
					System.out.println("Nome: " + produtos.pegarProdutos().get(i).getDescricao());
					System.out.println("Valor: " + produtos.pegarProdutos().get(i).getValorUnitario());
					System.out.println("-------------------------");
				}
				System.out.println();
				
				break;
			case 5:
				System.out.println("Digite a posição do que produto deseja selecionar: ");
				posicao = scan.nextInt();
				Produto produtoSelecionado = produtos.pegarProduto(posicao);
				System.out.println("Nome do produto selecionado : " +  produtoSelecionado.getDescricao() );
				System.out.println("Valor do produto selecionado : " + produtoSelecionado.getValorUnitario());
				System.out.println("-------------------------");
				System.out.println();
				break;
			default:
				System.out.println("Sistema Encerrado");
				opcao = -1;
			}
		}
		
	}

}
