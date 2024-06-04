package edu.thiago.anatomiadeclasses;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int notaUm = 6;
        int notaDois= 8;
        int mediaFinal = calcularMedia(notaUm, notaDois);

        if (mediaFinal<6) {
            System.out.println("Sua média é " + mediaFinal + ", portanto você está Reprovado." );
        }
        else if(mediaFinal==6){
            System.out.println("Sua média é " + mediaFinal + ", portanto você está de Exame." );
        }
        else{
            System.out.println("Sua média é " + mediaFinal + ", portanto você está Aprovado." );
        }
    }
    public static int calcularMedia(int notaUm, int notaDois){
        return (notaUm + notaDois)/2;
    }

}
