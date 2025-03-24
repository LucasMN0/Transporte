package Abs;

public abstract class Transporte {
    private int capacidade;

    public Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    public int exibirCapacidade() {
        return capacidade;
    }

    public abstract void mover();
}
