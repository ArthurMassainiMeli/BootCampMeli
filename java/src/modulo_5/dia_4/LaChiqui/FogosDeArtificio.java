package modulo_5.dia_4.LaChiqui;

public class FogosDeArtificio {
    private String barulho;

    public FogosDeArtificio(String barulho) {
        this.barulho = barulho;
    }

    public void estourar() {
        System.out.println(this.barulho);
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }
}
