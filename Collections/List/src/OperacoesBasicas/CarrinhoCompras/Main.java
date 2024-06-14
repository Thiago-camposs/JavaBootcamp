package OperacoesBasicas.CarrinhoCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Caneta", 2, 10);
        carrinhoDeCompras.adicionarItem("Borracha", 1, 2);
        carrinhoDeCompras.adicionarItem("Lapiseira", 7.50, 1);
        carrinhoDeCompras.removerItem("lapiseira");//como está aplicado ignore case vai funcionar
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total da compra: "+carrinhoDeCompras.calcularValorTotal());
    }
}
