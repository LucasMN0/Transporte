package Abs;

public class CarroEletrico extends Transporte implements Eletrico {
    private String modelo;

    public CarroEletrico(String modelo, int capacidade) {
        super(capacidade);
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }

    @Override
    public void mover() {
        System.out.println("O carro se move a uma velocidade de 80km/h.");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carro carregado completamente.");
    }
}
