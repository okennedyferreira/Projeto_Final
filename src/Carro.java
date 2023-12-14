//b. Carro (herda de Veiculo):
//numeroPortas: int
//capacidadePassageiros: int
//b. Carro:
//Sobrescreva o método calcularDepreciacao() para levar em consideração o número de portas e a capacidade de passageiros.


public class Carro extends Veiculo {
    private int numeroPortas;
    private int capacidadePassageiros;

    public Carro(String placa, String marca, String modelo, int ano, double valor, int quantidadeRodas,
                 int numeroPortas, int capacidadePassageiros) {
        super(placa, marca, modelo, ano, valor, quantidadeRodas);
        this.numeroPortas = numeroPortas;
        this.capacidadePassageiros = capacidadePassageiros;
    }


    public double calcularDepreciacao() {
        double depreciacaoBase = super.calcularDepreciacao();
        return depreciacaoBase - (numeroPortas * 1000) - (capacidadePassageiros * 500);
    }
}