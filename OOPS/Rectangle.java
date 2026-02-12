

class Rectangle {
    int length;
    int breadth;
    public void intia(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void area(){
        System.out.println(length*breadth);
    }
    public void perimeter(){

        int res = 2*(length+breadth);
        System.out.println(res);
    }
    public void display(){
        System.out.println("Length : "+length);
        System.out.println("Length : "+breadth);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.intia(5,10);
        r1.display();
        r1.area();
        r1.perimeter();
    }
}
