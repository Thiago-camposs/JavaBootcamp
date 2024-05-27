public class MinhaClasse{
    public static void main(String[] args) {
        //estrutura variaveis (Tipo NomeBemDefinido = Atribuição)
        String primeiroNome="Thiago";
        String segundoNome ="Campos";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        //o primeiro nomeCompleto é a variável, a segunda é o método pois tem os parâmetros, se ele nao tivesse parametros seria identificado como nomeCompleto()
        System.out.println(nomeCompleto);           
    }
    //declarando metodos (TipoRetorno NomeBemObjetivoNpInfinitivo Parametro(s))
    public static String nomeCompleto( String primeiroNome,String segundoNome){
        return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}