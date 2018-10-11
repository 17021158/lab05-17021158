public class Main {
    public static void main(String[]args){
        Shape x= new Shape();
        System.out.println(x.toString());
        Circle y=new Circle(1.0,"red",true);
        System.out.println(y.toString());
        Rectangle z= new Rectangle(2.0,5.0);
        System.out.println(z.toString());
        Square t=new Square(1.0,"red",false);
                t.setLength(2.0);
                t.setWidth(2.0);
                System.out.println(t.toString());
    }
}
