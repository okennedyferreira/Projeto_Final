//c. Moto (herda de Veiculo):
//
//tipoFreio: String (por exemplo, ABS, disco)
//
//cilindradas: int

//c. Moto:
//
//Sobrescreva o método calcularDepreciacao() para levar em consideração as cilindradas.

public class Moto extends Veiculo {
    private String tipoFreio;
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int ano, double valor, int quantidadeRodas,
                String tipoFreio, int cilindradas) {
        super(placa, marca, modelo, ano, valor, quantidadeRodas);
        this.tipoFreio = tipoFreio;
        this.cilindradas = cilindradas;
    }

    public double calcularDepreciacao() {
        double depreciacaoBase = super.calcularDepreciacao();
        return depreciacaoBase - (cilindradas * 10);
    }
}
