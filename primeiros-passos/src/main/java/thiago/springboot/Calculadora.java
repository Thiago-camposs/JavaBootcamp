package thiago.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int valor1,int valor2){
        return valor1+valor2;
    }
}
