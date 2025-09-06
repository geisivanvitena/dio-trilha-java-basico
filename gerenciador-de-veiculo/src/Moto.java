public class Moto extends Veiculo {

    @Override
    public void exibirDetalhesVeiculo() {
        System.out.println("DETALHES DA MOTO\n");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("___________________________\n");
    }

    @Override
    public void conferirItensDoVeiculo() {
        System.out.println("\nConferindo itens da moto...");
        System.out.println("Nível do oléo: OK");
        System.out.println("Combustível: OK");
        System.out.println("Pneus: OK");
        System.out.println("___________________________\n");
    }

    @Override
    public void ligar() {
        System.out.println("A MOTO FOI LIGADA  ");
    }

    @Override
    public void acelerar() {
        System.out.println("A MOTO ESTÁ ACELERANDO");
    }

    @Override
    public void frear() {
        System.out.println("A MOTO ESTÁ FREANDO");
    }

    @Override
    public void desligar() {
        System.out.println("A MOTO FOI DESLIGADA");
    }

    public void empinar() {
        System.out.println("A MOTO ESTÁ EMPINANDO");
    }
    
   
}
