//Neste projeto final em Java, você será responsável por implementar um sistema de gerenciamento de veículos
// que explore conceitos fundamentais como herança, sobrescrita de métodos e polimorfismo. O sistema deve ser
// capaz de lidar com diferentes tipos de veículos, cada um com características específicas.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Veículos!");

        while (true) {
            System.out.println("\nEscolha o tipo de veículo:");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Caminhão");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 4) {
                System.out.println("Saindo do programa. Até logo!");
                break;
            }

            Veiculo veiculo = criarVeiculo(opcao, scanner);

            if (veiculo != null) {
                exibirDepreciacao(veiculo);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static Veiculo criarVeiculo(int opcao, Scanner scanner) {
        System.out.println("Digite as informações do veículo:");

        System.out.print("Placa: ");
        String placa = scanner.next();

        System.out.print("Marca: ");
        String marca = scanner.next();

        System.out.print("Modelo: ");
        String modelo = scanner.next();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        System.out.print("Quantidade de Rodas: ");
        int quantidadeRodas = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Número de Portas: ");
                int numeroPortas = scanner.nextInt();

                System.out.print("Capacidade de Passageiros: ");
                int capacidadePassageiros = scanner.nextInt();

                return new Carro(placa, marca, modelo, ano, valor, quantidadeRodas, numeroPortas, capacidadePassageiros);

            case 2:
                System.out.print("Tipo de Freio: ");
                String tipoFreio = scanner.next();

                System.out.print("Cilindradas: ");
                int cilindradas = scanner.nextInt();

                return new Moto(placa, marca, modelo, ano, valor, quantidadeRodas, tipoFreio, cilindradas);

            case 3:
                System.out.print("Carga Máxima: ");
                double cargaMaxima = scanner.nextDouble();

                return new Caminhao(placa, marca, modelo, ano, valor, quantidadeRodas, cargaMaxima);

            default:
                return null;
        }
    }

    private static void exibirDepreciacao(Veiculo veiculo) {
        double depreciacao = veiculo.calcularDepreciacao();
        System.out.println("Depreciação do veículo: R$ " + depreciacao);
    }
}
