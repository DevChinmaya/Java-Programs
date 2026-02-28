public class CarDrive {
    public static void drive(Car c){
        c.start();
        c.accelerate();
        c.stop();
    }
    public static void main(String[] args) {
        drive(new Hector());
        drive(new Defender());
    }
}
class Car{
    public void start(){

    }
    public void accelerate(){
        
    }
    public void stop(){
        
    }
}
class Hector extends Car{
    @Override
    public void start(){
        System.out.println("Hector Started");
    }
    @Override
    public void accelerate(){
        System.out.println("Hector moves");

    }
    @Override
    public void stop(){
        System.out.println("Hector stopped");
    }
}
class M5 extends Car{
    @Override
    public void start(){
        System.out.println("M5 Started");
    }
    @Override
    public void accelerate(){
        System.out.println("M5 moves");

    }
    @Override
    public void stop(){
        System.out.println("M5 stopped");
    }
}
class Defender extends Car{
   @Override
    public void start(){
        System.out.println("Defender Started");
    }
    @Override
    public void accelerate(){
        System.out.println("Defender moves");

    }
    @Override
    public void stop(){
        System.out.println("Defender stopped");
    }
}
