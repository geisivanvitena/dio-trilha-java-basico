package app;

import iphone.IPhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA IPHONE ===");

        IPhone iphone = new IPhone();

        iphone.selecionarMusica("Smells Like Teen Spirit - Nirvana");
        iphone.tocar();
        iphone.pausar();
        iphone.ligar("12345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://www.apple.com/br/iphone");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
