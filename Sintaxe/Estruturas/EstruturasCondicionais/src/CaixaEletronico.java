public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 20.0;
        double valorSolicitado = 17.0;
        String saque = valorSolicitado<saldo?"Saque realizado com sucesso!":"Saldo insuficiente";
        System.out.println(saque);
    }
}
