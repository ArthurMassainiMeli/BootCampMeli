package modulo_5.dia_2.tt;

public class Tecnico extends Clt {
    private final Double SALARIO_BASE = 3200.00;
    private final Double GANHO_POR_META = 0.05;

    private Integer qtdMetasBatidas;

    public Tecnico(String nome, Integer qtdMetasBatidas) {
        super(nome);
        this.qtdMetasBatidas = qtdMetasBatidas;
    }

    @Override
    public Double calculaSalario() {
        return SALARIO_BASE + ((GANHO_POR_META*SALARIO_BASE) * qtdMetasBatidas);
    }

    @Override
    public String toString() {
        return "Funcionario CLT - Tecnico " + "nome: " + this.nome + " - salario: " + calculaSalario();
    }
}
