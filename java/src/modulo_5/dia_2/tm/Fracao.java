package modulo_5.dia_2.tm;

public class Fracao {

    private double valorDouble;

    public Fracao(double valorDouble) {
        this.valorDouble = valorDouble;
    }

    public double adicionar(int valor) {
        return (double) this.valorDouble + valor;
    }

    public double adicionar(double valor) {
        return this.valorDouble + valor;
    }

    public double subtrair(int valor) {
        return (double) this.valorDouble - valor;
    }

    public double subtrair(double valor) {
        return this.valorDouble - valor;
    }

    public double multiplicar(int valor) {
        return (double) this.valorDouble * valor;
    }

    public double multiplicar(double valor) {
        return this.valorDouble * valor;
    }

    public double dividir(int valor) {
        return (double) this.valorDouble / valor;
    }

    public double dividir(double valor) {
        return this.valorDouble / valor;
    }

    public double getValorDouble() {
        return valorDouble;
    }

    public void setValorDouble(double valorDouble) {
        this.valorDouble = valorDouble;
    }
}
