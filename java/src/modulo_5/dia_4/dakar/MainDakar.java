package modulo_5.dia_4.dakar;

import java.util.List;

public class MainDakar {
    public static void main(String[] args) {

        Corrida corrida = new Corrida(1000, 15000.00, "Corrida Maluca", 5);

        // Registra um carro e uma moto na corrida
        corrida.registrarCarro(100.00, 15.00, 30.00, "PPP-3131");
        corrida.registrarMoto(80.00, 10.00, 40.00, "XXX-4444");
        corrida.registrarCarro(100.00, 15.00, 30.00, "AAA-3333");
        corrida.registrarMoto(80.00, 10.00, 40.00, "BBB-5555");

        // Remove Veiculos por objeto e por placa
        corrida.removerVeiculo(new Carro(100.00, 15.00, 30.00, "PPP-3131"));

        corrida.removerVeiculoPorPlaca("XXX-4444");

        // Lista todos veiculos na corrida
        List<Veiculo> listaDeVeiculos = corrida.getListaVeiculos();

        listaDeVeiculos.forEach(System.out::println);

        // Printa o vencedor da corrida
        Veiculo vencedor = corrida.calcularVencedor(listaDeVeiculos);
        System.out.println("O vencedor é: " +vencedor.getPlaca());

        // Printa socorrendo carro e moto
        corrida.socorrerCarro("AAA-3333");
        corrida.socorrerMoto("BBB-5555");


    }
}
