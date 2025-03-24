package Abs;

public class Bicicleta extends Transporte {
    private String cor;

    public Bicicleta(String cor, int capacidade) {
        super(capacidade);
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta se move a uma velocidade de 20km/h.");
    }
}
