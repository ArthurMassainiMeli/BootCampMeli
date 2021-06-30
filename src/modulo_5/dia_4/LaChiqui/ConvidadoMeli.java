package modulo_5.dia_4.LaChiqui;

public class ConvidadoMeli extends Convidado implements GritarAposComer {
    public ConvidadoMeli(String nome) {
        super(nome);
    }

    @Override
    public void comer() {
        System.out.println("Viva la Chiqui !!");
    }
}
