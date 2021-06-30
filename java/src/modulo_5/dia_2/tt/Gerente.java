package modulo_5.dia_2.tt;

public class Gerente extends Clt {
    private final Double SALARIO_BASE = 6000.00;
    private final Double GANHO_POR_HORA = SALARIO_BASE / 30 / (36 / 5);
    private final Double GANHO_POR_META = 1.125;

    private Integer qtdMetasBatidas;

    public Gerente(String nome, Integer qtdMetasBatidas) {
        super(nome);
        this.qtdMetasBatidas = qtdMetasBatidas;
    }

    @Override
    public Double calculaSalario() {
        return SALARIO_BASE + ((GANHO_POR_META * SALARIO_BASE) * qtdMetasBatidas) + (GANHO_POR_HORA * 4 * 4);
    }

    @Override
    public String toString() {
        return "Funcionario CLT - Gerente" + "nome: " + this.nome + " - salario: " + calculaSalario();
    }
}
