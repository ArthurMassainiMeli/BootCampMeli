package modulo_5.dia_2.tt;

public class Analista extends Clt {
    private final Double SALARIO_BASE = 4000.00;
    private final Double GANHO_POR_HORA = SALARIO_BASE / 30 / (40/5);
    private final Double GANHO_POR_META = 1.08;

    private Integer qtdMetasBatidas;

    public Analista(String nome, Integer qtdMetasBatidas) {
        super(nome);
        this.qtdMetasBatidas = qtdMetasBatidas;
    }

    @Override
    public Double calculaSalario() {
        return SALARIO_BASE + ((GANHO_POR_META*SALARIO_BASE) * qtdMetasBatidas) + (GANHO_POR_HORA * 4 * 4);
    }

    @Override
    public String toString() {
        return "Funcionario CLT - Analista" + "nome: " + this.nome + " - salario: " + calculaSalario();
    }
}
