package modulo_5.dia_1.tm.parte_2;

public class SegundoExercicio {
    public static void main(String[] args) {

        double empresaX = 1.13;
        double crescimentoX = 2.48;
        double empresaY = 18.4;
        double crescimentoY = 1.32;
        int year = 2021;

        System.out.println(String.format("Empresa X - 01/01/" + year + " - Valor da empresa: %.2f" + "m", empresaX));
        System.out.println(String.format("Empresa Y - 01/01/" + year + " - Valor da empresa: %.2f" + "m", empresaY));

        while (true) {
            empresaX *= crescimentoX;
            empresaY *= crescimentoY;

            System.out.println(String.format("Empresa X - 01/01/" + year + " - Valor da empresa: %.2f" + "m", empresaX));
            System.out.println(String.format("Empresa Y - 01/01/" + year + " - Valor da empresa: %.2f" + "m", empresaY));

            year++;

            if (empresaX > empresaY) {
                break;
            }
        }
    }
}
