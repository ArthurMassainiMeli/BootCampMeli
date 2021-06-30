package modulo_5.dia_4.LaChiqui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainLaChiqui {
    public static void main(String[] args) {
        FogosDeArtificio fogos1 = new FogosDeArtificio("BUM");
        FogosDeArtificio fogos2 = new FogosDeArtificio("CABUM");
        FogosDeArtificio fogos3 = new FogosDeArtificio("QUAITCHUM");
        FogosDeArtificio fogos4 = new FogosDeArtificio("PIMBAUM");

        List<FogosDeArtificio> listaDeFogos = Arrays.asList(fogos1, fogos2, fogos4, fogos3);

        ConvidadoMeli convidado1 = new ConvidadoMeli("Arthur");
        ConvidadoMeli convidado2 = new ConvidadoMeli("Daniel");
        ConvidadoMeli convidado3 = new ConvidadoMeli("Ricardo");

        List<ConvidadoMeli> listaDeConvidados = Arrays.asList(convidado1, convidado2, convidado3);

        listaDeConvidados.forEach(convidado -> convidado.comer());

        System.out.println("Fogos:");
        listaDeFogos.forEach(fogos -> fogos.estourar());
    }
}
