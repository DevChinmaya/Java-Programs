public class DivideConquer {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone("Apple",1076219181,12,256,"White");
        s.display();
    }
}
class Phone{
    String name;
    long num;
    Phone(String name){
        this.name = name;
    }
    Phone(String name,long num){
        this(name);
        this.num = num;
    }
}
class SmartPhone extends Phone{
    int ram;
    int rom;
    String color;
    SmartPhone(String name,long num,int ram,int rom,String color){
        super(name,num);
        this.ram = ram;
        this.rom = rom;
        this.color = color;
    }
    public void display(){
        System.out.println(name+"\t"+num+"\t"+ram+"\t"+rom+"\t"+color);
    }
}
