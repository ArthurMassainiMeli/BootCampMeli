package modulo_5.dia_4;

import java.util.*;

public class MainSaveTheRopa {
    public static void main(String[] args) {

        Vestuario vestuario1 = new Vestuario("Havaianas", "Bermuda");
        Vestuario vestuario2 = new Vestuario("Zara", "Jaqueta");

        Vestuario vestuario3 = new Vestuario("Chanel", "Camiseta");
        Vestuario vestuario4 = new Vestuario("Hering", "Calça");

        List<Vestuario> listaDeVestuarios = Arrays.asList(vestuario1, vestuario2);
        List<Vestuario> listaDeVestuarios2 = Arrays.asList(vestuario3, vestuario4);

        GuardaRoupa guardaRoupa1 = new GuardaRoupa();

        Integer identificador1 = guardaRoupa1.guardarVestuarios(listaDeVestuarios);
        Integer identificador2 = guardaRoupa1.guardarVestuarios(listaDeVestuarios2);

        System.out.println("---------- Identificadores ---------");
        System.out.printf("Seu identificador é: %d\n", identificador1);
        System.out.printf("Seu identificador é: %d\n", identificador2);

        System.out.println();
        System.out.println("---------- Todo guarda-roupa ---------");
        guardaRoupa1.mostrarVestuarios();

        System.out.println();
        System.out.printf("---------- Todas as roupas no identificador %d ---------\n", identificador1);
        guardaRoupa1.devolverVestuarios(identificador1).forEach(l -> System.out.println(l));

        System.out.println();
        System.out.printf("---------- Todas as roupas no identificador %d ---------\n", identificador2);
        guardaRoupa1.devolverVestuarios(identificador2).forEach(l -> System.out.println(l));


    }
}
