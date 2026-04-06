//Write a java program to sort the mobiles in descending order according to price
public class Mobile implements Comparable {
    String name;
    String color;
    double price;
    public Mobile(String name,String color,double price){
        this.name=name;
        this.color=color;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Emp [name="+ ", color="+color+", id="+price+"]";
    }
    //swap acc to price
    // @Override
    // public int compareTo(Object o){
    //     Mobile m=(Mobile)o;
    //     return (int) (m.price-this.price);
    // }
    @Override
    public int compareTo(Object o){
        Mobile m=(Mobile)o;
        return this.name.compareTo(m.name);
    }
}



