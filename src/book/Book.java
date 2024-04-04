package book;

public class Book extends Author{
    private String name;
    private Author author;
    private double price;
    private int qty;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        return "Book[name: "+getName()+author.toString()+"] price: "+ getPrice()+", qty: "+getQty()+"]";
    }


    public Book(String name, Author author, double price){
        super(author.getName(), author.getEmail(), author.getGender());
        setName(name);
        setAuthor(author);
        setPrice(price);
    }

    public Book(String name, Author author, double price, int qty){
        super(author.getName(), author.getEmail(), author.getGender());
        setName(name);
        setAuthor(author);
        setPrice(price);
        setQty(qty);
    }

}
