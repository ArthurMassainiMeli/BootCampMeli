package modulo_5.dia_2.tm;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(10000.00);
        ContaCorrente cc2 = new ContaCorrente(15000.00);
        ContaCorrente cc3 = new ContaCorrente(cc2);

        System.out.println("---- Saldos das Contas Correntes inicialmente ----");

        System.out.println("Conta 01 - " + cc1);
        System.out.println("Conta 02 - " + cc2);
        System.out.println("Conta 03 - " + cc3);


        System.out.println("---- Saldos das Contas Correntes após saque e deposito ----");

        cc1.saque(1000);
        cc2.deposito(500);
        cc3.deposito(1000);

        System.out.println("Conta 01 - " + cc1);
        System.out.println("Conta 02 - " + cc2);
        System.out.println("Conta 03 - " + cc3);

        System.out.println("---- Saldos das Contas Correntes após transferencia ----");

        cc1.transferencia(1000, cc2);
        cc2.transferencia(100, cc3);
        cc3.transferencia(500, cc1);

        System.out.println("Conta 01 - " + cc1);
        System.out.println("Conta 02 - " + cc2);
        System.out.println("Conta 03 - " + cc3);
    }
}
