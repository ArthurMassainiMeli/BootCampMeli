package modulo_5.dia_1.tm.parte_2;

import java.util.Scanner;

public class TerceiroExercicio {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        double total;

        String nome1 = "Arroz";
        double preco1 = 10.99;
        int quantidade1 = 2;

        produto1.setNome(nome1);
        produto1.setPreco(preco1);
        produto1.setQuantidade(quantidade1);

        String nome2 = "Feijão";
        double preco2 = 14.49;
        int quantidade2 = 1;

        produto2.setNome(nome2);
        produto2.setPreco(preco2);
        produto2.setQuantidade(quantidade2);

        String nome3 = "Tomate";
        double preco3 = 9.99;
        int quantidade3 = 5;

        produto3.setNome(nome3);
        produto3.setPreco(preco3);
        produto3.setQuantidade(quantidade3);

        total = produto1.getPreco() * produto1.getQuantidade() + produto2.getPreco() * produto2.getQuantidade() + produto3.getPreco() * produto3.getQuantidade();
        System.out.println("Valor total da compra:" + total);
    }
}
