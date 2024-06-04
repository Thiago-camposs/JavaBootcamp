package edu.thiago.operadores;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        //utilizando Atribuição(=)
        String nomeCompleto = "Thiago Campos";
        int idade = 21;
        char sexo = 'M';
        double peso = 62.5;
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //operadores aritméticos
        double soma = 10.5 + 15.7; //quando + é utilizado em strings ele faz a função de concatenar
        int subtracao = 115 - 23;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7)+(20 / 4);
        System.out.println(resultado);

        //unário 
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        
        //ternário (pode ser usado para substituir um if/else simples de uma condição)
        int a=5; int b=6;
        String ternario = (a==b) ? "verdadeiro" : "falso";
        System.out.println(ternario);
        //relacionais (==)(!=)(>)(<)(>=)(<=)
        //lógicos "E"(&&)"OU"(||)
    }
}
