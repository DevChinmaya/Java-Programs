public class TestCar {
    public static void main(String[] args) {
        //Composition
        Engine e1 = new Engine("w3",550);
        Car c1 = new Car("Benz",e1);
        c1.startCar();
        c1.carInfo();
        //Aggregation
        Musicplayer m = new Musicplayer("JBL");
        c1.startMusic(m);
    }
}
class Engine{
    String name;
    int hp;
    Engine(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    public void startEngine(){
        System.out.println("Car Started");
    }
}
class Musicplayer{
    String mpname;
    Musicplayer(String mpname){
        this.mpname = mpname;
    }
}
class Car{
    String modelname;
    Engine e;
    public Car(String modelname,Engine e){
        this.modelname=modelname;
        this.e = e;
    }
    public void carInfo(){
        System.out.println("Car model name is "+modelname);
        System.out.println("Car engine name is "+e.name);
        System.out.println("Car provide hp is "+e.hp);
    }
    public void startCar(){
        e.startEngine();
    }
    public void startMusic(Musicplayer mp){
        System.out.println("Nice music played with "+mp.mpname);
    }
}
