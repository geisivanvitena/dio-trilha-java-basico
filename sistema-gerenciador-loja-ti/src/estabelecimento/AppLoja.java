package estabelecimento;

import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Lasejet;
import equipamentos.multifuncional.Multifuncional;

public class AppLoja {
    public static void main(String[] args) {
        System.out.println("=== SEJA BEM VINDO A LOJA TI ===");

        Xerox copiadora = new Xerox();
        copiadora.copiar();
        Scanner scanner = new Scanner();
        scanner.digitalizar();
        Deskjet impressora = new Deskjet();
        impressora.imprimir();
        Lasejet impressora2 = new Lasejet();
        impressora2.imprimir();

        Multifuncional multifuncional = new Multifuncional();
        multifuncional.copiar();
        multifuncional.digitalizar();
        multifuncional.imprimir();     
       
    }
}
