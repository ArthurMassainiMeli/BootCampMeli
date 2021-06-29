package modulo_5.dia_2.tt;

public class Diretor extends Clt {
    private final Double SALARIO_BASE = 15000.00;
    private final Double PORCENTAGEM_DOS_LUCROS = 0.03;

    private Double lucros;

    public Diretor(String nome, Double lucros) {
        super(nome);
        this.lucros = lucros;
    }

    @Override
    public Double calculaSalario() {
        return SALARIO_BASE + (PORCENTAGEM_DOS_LUCROS * this.lucros);
    }

    @Override
    public String toString() {
        return "Funcionario CLT - Diretor" + "nome: " + this.nome + " - salario: " + calculaSalario();
    }
}
