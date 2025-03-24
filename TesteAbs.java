package Abs;

public class TesteAbs {
    public static void main(String[] args) {
        Transporte[] t = new Transporte[3];
        t[0] = new CarroEletrico("Sandeiro", 5);
        t[1] = new Bicicleta("Vermelho", 1);
        t[2] = new Bicicleta("Verde", 1);



        System.out.println("Informações sobre o Carro!");
        if (t[0] instanceof CarroEletrico){
            CarroEletrico carro = (CarroEletrico)t[0];
            System.out.println("Modelo do Carro: "+carro.getModelo());
            carro.carregarBateria();
        }
        System.out.println("Capacidade do Carro: "+t[0].exibirCapacidade());
        t[0].mover();
        System.out.println("\n");



        System.out.println("Informações sobre a Bicicleta!");
        if (t[1] instanceof Bicicleta){
            Bicicleta bike = (Bicicleta)t[1];
            System.out.println("Cor da Bicicleta: "+bike.getCor());
        }
        System.out.println("Capacidade da Bicicleta: "+t[1].exibirCapacidade());
        t[1].mover();
        System.out.println("\n");




        System.out.println("Informações sobre a Bicicleta!");
        if (t[2] instanceof Bicicleta){
            Bicicleta bike = (Bicicleta)t[2];
            System.out.println("Cor da Bicicleta: "+bike.getCor());
        }
        System.out.println("Capacidade da Bicicleta: "+t[2].exibirCapacidade());
        t[2].mover();
        System.out.println("\n");
    }
}
