package modulo_5.dia_4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> dicionario = new HashMap<>();
    private Integer identificador;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        this.identificador = new Random().nextInt(1000);
        dicionario.put(this.identificador, listaDeVestuario);
        return this.identificador;
    }

    public void mostrarVestuarios() {
        for (Integer key : dicionario.keySet()) {
            System.out.println("Identificador " + key + " - Peças no guarda-roupa:\n" + dicionario.get(key));
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List<Vestuario> lista = dicionario.get(id);
        return lista;
    }

    // Getters and Setters

    public Map<Integer, List<Vestuario>> getDicionario() {
        return dicionario;
    }

    public void setDicionario(Map<Integer, List<Vestuario>> dicionario) {
        this.dicionario = dicionario;
    }

}
