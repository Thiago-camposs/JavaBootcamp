public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 20.0;
        double valorSolicitado = 17.0;
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }else{
            System.out.println("Seu saldo é insuficiente!");
        }
    }
}
