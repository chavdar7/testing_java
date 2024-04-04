package circle;

public class Main {
public static void main(String[] args) {


    Circle obj1 = new Circle();

    System.out.println("first circle's color is " + obj1.getColor());
    System.out.println("first circle's radius before is " + obj1.getRadius());
    obj1.setRadius(5.0);
    System.out.println("first circle's radius after is " + obj1.getRadius());
    System.out.println("first circle's area after is " + obj1.getArea());

    System.out.println(" ");

    Circle obj2 = new Circle(4.0);
    System.out.println("first circle's color is " + obj2.getColor());
    System.out.println("first circle's radius is " + obj2.getRadius());
    System.out.println("first circle's area is " + obj2.getArea());

    }
}