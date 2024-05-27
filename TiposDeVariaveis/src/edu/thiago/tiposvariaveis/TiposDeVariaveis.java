package edu.thiago.tiposvariaveis;

public class TiposDeVariaveis {
    public static void main(String[] args) {
        //aspas simples
        char sexo = 'M';
        //aspas duplas
        String meuNome = "Thiago Campos";

        //em java ao utilizar inteiro, dar preferencia a utilizacao de int
        int ano = 2024;
        short numeroCurto = 123;
        //long possui o dobro de bytes de int, mas deve ser identificado com L no final 
        long numeroLongo = 999999999L;
        
        //ao utilizar decimal, dar preferencia ao double 
        double salario = 1800;
        //deve ser identificado com F no final
        float dolar = 5.17F;
        
        //variaveis x constantes
        int numero = 15;
        numero = 16;
        System.out.println(numero); //imprime o numero 16 atribuido anteriormente
        
        final double VALOR_PI = 3.14; 
        //para definir uma constante utiliza-se final antes do tipo
        //e por convenção deve ser declarada em CAIXA ALTA
    }
}
