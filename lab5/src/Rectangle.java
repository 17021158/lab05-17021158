public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        this.setWidth(1.0);
        this.setLength(1.0);
    }
    public Rectangle(double width,double length){
        this.setWidth(width);
        this.setLength(length);
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }
    public double getArea(){
        return this.width*this.length;
    }
    public String toString(){
        return super.toString()+"\n"+getLength()+"\n"+getWidth();
    }
}
