package modulo_5.dia_4.dakar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Corrida {
    private Integer distancia;
    private Double premioEmDolares;
    private String nome;
    private Integer quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos = new ArrayList<>();

    private SocorristaCarro sc = new SocorristaCarro();
    private SocorristaMoto sm = new SocorristaMoto();

    // constructor

    public Corrida(Integer distancia, Double premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    // metodos da classe

    public void registrarCarro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        if (listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void registrarMoto(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        if (listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        this.listaVeiculos = listaVeiculos.stream().filter(veiculo -> !veiculo.getPlaca().equals(placa)).collect(Collectors.toList());
    }


    public Veiculo calcularVencedor(List<Veiculo> lista) {
        Veiculo vencedor = null;
        Double maior = null;

        for (int i = 0; i < lista.size(); i++) {
            Double valor = (Double) (lista.get(i).getVelocidade() * lista.get(i).getAceleracao() / (lista.get(i).getAnguloDeGiro() * (lista.get(i).getPeso() - lista.get(i).getRodas() * 100)));
            if (i == 0) {
                maior = valor;
                vencedor = lista.get(i);
            } else if (valor > maior) {
                maior = valor;
                vencedor = lista.get(i);
            }
        }
        return vencedor;
    }

    public void socorrerCarro(String placa) {
        List<Veiculo> lista = listaVeiculos.stream().filter(veiculo2 -> veiculo2.getPlaca().equals(placa)).collect(Collectors.toList());
        sc.socorrer((Carro) lista.get(0));
    }

    public void socorrerMoto(String placa) {
        List<Veiculo> lista = listaVeiculos.stream().filter(veiculo2 -> veiculo2.getPlaca().equals(placa)).collect(Collectors.toList());
        sm.socorrer((Moto) lista.get(0));
    }


    // Getters and Setters

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(Double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
}
