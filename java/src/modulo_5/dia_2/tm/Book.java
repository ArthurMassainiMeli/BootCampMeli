package modulo_5.dia_2.tm;

public class Book {
    private String titulo;
    private String autor;
    private int ano;

    public Book(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void emprestimo() {
        System.out.printf("Voce está pegando emprestado o livro %s \n", this.titulo);
    }

    public void devolver() {
        System.out.printf("Voce está devolvendo o livro %s \n", this.titulo);
    }

    @Override
    public String toString() {
        return this.titulo + ", autor(a): " + this.autor + ", escrito em " + this.ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
