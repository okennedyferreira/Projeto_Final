//d. Caminhao (herda de Veiculo):
//
//cargaMaxima: double

//d. Caminhao:
//
//Sobrescreva o método calcularDepreciacao() para levar em consideração a carga máxima.


public class Caminhao extends Veiculo {
    private double cargaMaxima;

    public Caminhao(String placa, String marca, String modelo, int ano, double valor, int quantidadeRodas,
                    double cargaMaxima) {
        super(placa, marca, modelo, ano, valor, quantidadeRodas);
        this.cargaMaxima = cargaMaxima;
    }


    public double calcularDepreciacao() {
        // Lógica específica para calcular a depreciação de um caminhão
        double depreciacaoBase = super.calcularDepreciacao();
        return depreciacaoBase - (cargaMaxima * 0.01);
    }
}
