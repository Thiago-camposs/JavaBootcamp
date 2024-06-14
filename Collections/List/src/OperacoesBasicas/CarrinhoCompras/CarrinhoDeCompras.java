package OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    private List<Item> itemList;
    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }
    //Métodos
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal= 0.0;
        for (Item item : itemList) {
            valorTotal += item.getPreco()*item.getQuantidade();
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println("O total de itens no carrinho é de: ");
        for (Item item : itemList) {
            System.out.println("Produto: "+item.getNome()+"\nPreço:"+item.getPreco()+"\nQuantidade:"+item.getQuantidade()+"\n");
        }
    }
}
