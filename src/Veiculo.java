//a. Veiculo:
//placa: String
//marca: String
//modelo: String
//ano: int
//valor: double
//quantidadeRodas: int

//a. Veiculo:
//Método calcularDepreciacao(): double que retorna o valor depreciado do veículo com base no ano.

public class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valor;
    protected int quantidadeRodas;

    public Veiculo(String placa, String marca, String modelo, int ano, double valor, int quantidadeRodas) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.quantidadeRodas = quantidadeRodas;
    }

    public double calcularDepreciacao() {
        int anosPassados = 2023 - ano;
        return valor * 0.2 * anosPassados; //Conforme Receita Federal
    }
}