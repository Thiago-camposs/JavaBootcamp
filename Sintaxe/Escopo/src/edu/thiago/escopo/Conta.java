package edu.thiago.escopo;

public class Conta {
    double saldo=10.0;
    public void sacar(Double valor) { //essa variavel valor só existe nesse método
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        System.out.println(saldo); /*saldo vai estar disponível em todo o código pois foi 
        declarada como uma variavel da classe*/
            
        System.out.println(/*novoSaldo*/);/*aqui novoSaldo vai gerar um erro, pois é uma variavel que foi
        gerada diretamente no método anterior, ficando inacessível fora dele */
    }
} 
