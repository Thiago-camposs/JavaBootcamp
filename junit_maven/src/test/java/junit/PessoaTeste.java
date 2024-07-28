package junit;

import java.security.Permission;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;

public class PessoaTeste {
    @Test
    public void calcularIdadeCorreta(){
        Pessoa joaozinho = new Pessoa("João", LocalDate.of(2004, 1, 1));
        Assertions.assertEquals(20, joaozinho.getIdade());
    }
    @Test
    public void validarMaioridade(){
        Pessoa joaozinho = new Pessoa("João", LocalDate.of(2004, 1, 1));
        Assertions.assertTrue(joaozinho.maiorDeIdade());
    }
    
}
