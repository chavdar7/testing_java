package book;


public class Main {

    public static void main(String[] args) {

        Author sena1 = new Author("sena", "reyhan.syy@gmail.com", 'f');

        Book b1 = new Book("harry",sena1,13);
        Book b2 = new Book("potter",sena1, 89,12);

        System.out.println(sena1);
        System.out.println(sena1.getName());

        System.out.println(b1);
        System.out.println(b1.getName());

        System.out.println(b2);
        System.out.println(b2.getName());
        b2.setName("uçurtma avcısı");
        System.out.println(b2.getName());

    }
}
