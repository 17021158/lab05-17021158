public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        this.length=side;
        this.width=side;
    }
    public void setWidth(double width){
        super.setWidth(width);
    }
    public void setLength(double length){
        super.setLength(length);
    }
    public String toString(){
        return super.toString()+"\n"+this.getSide();
    }

}
