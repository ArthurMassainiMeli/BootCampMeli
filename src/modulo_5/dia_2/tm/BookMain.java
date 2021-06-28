package modulo_5.dia_2.tm;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rowling", 1999);
        Book book2 = new Book("Senhor dos anéis", "JRR Tolkien", 1930);

        System.out.println(book1);
        System.out.println(book2);

        book1.devolver();
        book2.emprestimo();
    }
}
