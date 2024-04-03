public class Circle {

    private double radius;
    private String color;

    public String getColor(){
        return color;
    }


    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }


    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
