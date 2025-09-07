package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO DOCUMENTO VIA EQUIPAMENTO MULTIFUNCIONAL...");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO DOCUMENTO VIA EQUIPAMENTO MULTIFUNCIONAL...");
    }

    @Override
    public void copiar() {
        System.out.println("COPIANDO DOCUMENTO VIA EQUIPAMENTO MULTIFUNCIONAL...");
    }
    
}
