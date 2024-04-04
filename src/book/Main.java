package book;

public class Main {

    public static void main(String[] args) {

        Author sena1 = new Author("sena", "reyhan.syy@gmail.com", 'f');

        Book b1 = new Book("harry",sena1,13);

        System.out.println(sena1);

        System.out.println(b1);

    }
}
