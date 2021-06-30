package modulo_5.dia_4.LaChiqui;

public abstract class Convidado {
    private String nome;

    public Convidado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
