package modulo_5.dia_2.tt;

public abstract class Clt extends Funcionario {

    public Clt(String nome) {
        super(nome);
    }

    @Override
    public abstract Double calculaSalario();

}
