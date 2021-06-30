package modulo_5.dia_2.tt;

public class Pj extends Funcionario {
    private Double horasTrabalhadas;
    private Double valorPorHora;

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Pj(String nome, Double horasTrabalhadas, Double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public Double calculaSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public String toString() {
        return "Funcionario PJ - " + "nome: " + this.nome + " - salario: " + calculaSalario();
    }
}
