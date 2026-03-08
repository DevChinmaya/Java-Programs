public class Demo {
    public static void main(String[] args) {
        Rectangle  r = new Rectangle("Red",5, 10);
        r.getArea();
        r.display();
        Circle c = new Circle("Pink",5);
        c.getArea();
        c.display();
    }
}

abstract class Shape{
    String color;
    public Shape(String color){
        this.color = color;
    }
    abstract public void getArea();
    abstract public void display();
}
class Rectangle extends Shape{
    int l;
    int b;
    
    public Rectangle(String color,int l,int b){
        super(color);
        this.l=l;
        this.b=b;
    }
    @Override
    public void getArea(){
        System.out.println(l*b);
    }
    @Override
    public void display(){
        System.out.println("Color: "+color);
        System.out.println("Length: "+l);
        System.out.println("Breadth: "+b);
    }
}

class Circle extends Shape{
    int r;
    
    public Circle(String color,int r){
        super(color);
        this.r=r;
    }
    @Override
    public void getArea(){
        double area = 3.14*r*r;
        System.out.println(area);
    }
    @Override
    public void display(){
        System.out.println("Color: "+color);
        System.out.println("Radius: "+r);
    }
}