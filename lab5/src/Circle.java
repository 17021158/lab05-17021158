public class Circle extends Shape {
    private final double pi=3.14;
    private double radius;
    public Circle(){
        this.setRadius(1.0);
    }
    public Circle(double radius){
        this.setRadius(radius);
    }
    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*this.pi;
    }
    public String toString(){
        return super.toString()+" "+getRadius();
    }
}
