package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Multifuncional");
    }
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Multifuncional");
    }
    @Override
    public void copiar() {
        System.out.println("Copiando via Multifuncional");
    }
}
