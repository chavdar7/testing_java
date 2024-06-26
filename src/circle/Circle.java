package circle;

public class Circle {

    private double radius;
    private String color;

    ///////////////////////////////
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    ///////////////////////////////
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //////////////////////////////
    public double getArea(){
        return radius*radius*Math.PI;
    }

    //////////////////////////////

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }
}
