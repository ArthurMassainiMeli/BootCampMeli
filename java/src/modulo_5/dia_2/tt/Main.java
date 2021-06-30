package modulo_5.dia_2.tt;

public class Main {
    public static void main(String[] args) {
        Pj funcionario1 = new Pj("Batista da Silva", 30.0, 35.00);
        Pj funcionario2 = new Pj("Francisco Coco", 40.0, 40.00);

        System.out.println(funcionario1);
        System.out.println(funcionario2);

        Tecnico funcionario3 = new Tecnico("Marcelo Rodrigo", 3);
        Analista funcionario4 = new Analista("Bruno Macedo", 0);
        Gerente funcionario5 = new Gerente("Caco Barcelos", 0);
        Diretor funcionario6 = new Diretor("Bruno Costa", 100000.00);


        System.out.println(funcionario3);
        System.out.println(funcionario4);

        System.out.println(funcionario5);
        System.out.println(funcionario6);


    }
}
