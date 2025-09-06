public abstract class Veiculo {
  
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void exibirDetalhesVeiculo();

    public abstract void conferirItensDoVeiculo();

    public abstract void ligar();

    public abstract void acelerar();

    public abstract void frear();

    public abstract void desligar();
}
