package poo;

import service.ServiceProduto;

public class Print {
    
    public void bemVindo(){
        System.out.println("--------------");
		System.out.println("-- Bem Vindo--");
		System.out.println("--------------");
    }
   
    public void menu(){
        System.out.println("Inserir Produto Digite - 1");
        System.out.println("Remover Produto Digite - 2");
        System.out.println("Alterar Produto Digite - 3");
        System.out.println("Listar Produtos Digite - 4");
        System.out.println("Selecionar um produto Digite - 5");
        System.out.println("Digite qualquer outro número para sair");
        System.out.println();
    }
    public void imprimeProduto(ServiceProduto produtos, int posicao){
        Produto produtoSelecionado = produtos.pegarProduto(posicao);
        System.out.println("Nome do produto selecionado : " +  produtoSelecionado.getDescricao() );
        System.out.println("Valor do produto selecionado : " + produtoSelecionado.getValorUnitario());
        System.out.println("-------------------------");
        System.out.println();
    }
    public void imprimeProdutos(ServiceProduto produtos){
        System.out.println("----Lista De Produtos----");
        for(int i = 0; i < produtos.pegarProdutos().size();i++) {
            System.out.println("Nome: " + produtos.pegarProdutos().get(i).getDescricao());
            System.out.println("Valor: " + produtos.pegarProdutos().get(i).getValorUnitario());
            System.out.println("-------------------------");
        }
        System.out.println();
    }

    public void retorno(String retorno){
        System.out.println(retorno);
        System.out.println("-------------------------");
        System.out.println();
    }

    public void fechaPrograma(){
        System.out.println("Programa Encerrado");
    }
}
