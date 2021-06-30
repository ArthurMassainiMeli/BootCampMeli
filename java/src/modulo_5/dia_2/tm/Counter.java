package modulo_5.dia_2.tm;

public class Counter {

    private int valor;

    public Counter() {
    }

    public Counter(int valor) {
        this.valor = valor;
    }

    public Counter(Counter c) {
        this.valor = c.getValor();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void aumenta(int incremento) {
        this.valor += incremento;
    }

    public void diminui(int decremento) {
        this.valor -= decremento;
    }

    @Override
    public String toString() {
        return "valor: " + valor;
    }
}
