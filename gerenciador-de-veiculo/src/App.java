public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==== SISTEMA GERENCIADOR DE VEÍCULOS ===\n");
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2020);
        carro.exibirDetalhesVeiculo();
        carro.conferirItensDoVeiculo();
        carro.ligar();
        carro.acelerar();
        carro.acionarArCondicionado();
        carro.ligarRadio();
        carro.frear();
        carro.desligar();

        System.out.println("____________________________");

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CB500");
        moto.setAno(2019);
        moto.exibirDetalhesVeiculo();
        moto.conferirItensDoVeiculo();
        moto.ligar();
        moto.acelerar();
        moto.empinar();
        moto.frear();
        moto.desligar();
    }
}
