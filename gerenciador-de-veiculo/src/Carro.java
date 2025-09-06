public class Carro extends Veiculo{

    @Override
    public void exibirDetalhesVeiculo() {
        System.out.println("DETALHES DO CARRO \n");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("___________________________\n");
    }

    @Override
    public void conferirItensDoVeiculo() {
        System.out.println("\nConferindo itens do carro...");
        System.out.println("Nível do oléo: OK");
        System.out.println("Combustível: OK");
        System.out.println("Pneus: OK");
        System.out.println("___________________________\n");
    }

    @Override
    public void ligar() {
        System.out.println("O CARRO FOI LIGADO  ");
    }

    @Override
    public void acelerar() {
        System.out.println("O CARRO ESTÁ ACELERANDO");
    }

    @Override
    public void frear() {
        System.out.println("O CARRO ESTÁ FREANDO");
    }

    @Override
    public void desligar() {
        System.out.println("O CARRO FOI DESLIGADO");
    }

    public void acionarArCondicionado() {
        System.out.println("O AR CONDICIONADO FOI LIGADO");
    }
    public void ligarRadio() {
        System.out.println("O RÁDIO FOI LIGADO");
    }
    
    
}
