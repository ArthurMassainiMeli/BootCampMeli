package modulo_5.dia_4;

public class Vestuario {

    private String marca;
    private String modelo;

    public Vestuario() {
    }

    public Vestuario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " & Modelo: " + modelo;
    }
}