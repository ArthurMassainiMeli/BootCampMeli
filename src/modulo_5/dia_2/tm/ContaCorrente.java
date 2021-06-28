package modulo_5.dia_2.tm;

public class ContaCorrente {

    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente cc) {
        this.saldo = cc.getSaldo();
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo -= valor;
    }

    // nao entendi direito como deveria acontecer uma devolucao
    public void devolucao() {
    }

    public void transferencia(double valor, ContaCorrente cc) {
        this.saldo -= valor;
        cc.setSaldo(cc.getSaldo() + valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "saldo: " + saldo;
    }
}
