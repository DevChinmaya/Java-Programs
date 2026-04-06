public class Mobile {
    String name;
    String color;
    double price;
    int ram;
    int rom;
    public Mobile(String name,String color,double price,int ram,int rom){
        this.name=name;
        this.color=color;
        this.price=price;
        this.ram=ram;
        this.rom=rom;
    }
    @Override
    public String toString(){
        return "Mobile [name="+ name+", color="+color+", price="+price+", ram="+ram+", rom="+rom+"]";
    }
}
