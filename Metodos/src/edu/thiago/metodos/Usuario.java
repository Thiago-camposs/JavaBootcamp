package edu.thiago.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("A TV está ligada ? "+ smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status ->TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status ->TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(7);
    }
}
