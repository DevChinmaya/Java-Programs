public class VehicleDriver {
    public static void drive_1(Car c){
        System.out.println(c.getClass().getSimpleName()+ " is Driving...");
    }
    public static void drive_2(Bike c){
        System.out.println(c.getClass().getSimpleName()+ " is Driving...");       
    }
    public static void drive_3(Vehicle c){
        System.out.println(c.getClass().getSimpleName()+ " is Driving...");
    }
    public static void main(String[] args) {
        drive_1(new Benz());
        drive_1(new Audi());
        drive_1(new Bmw());
        //drive_1(new Rx100());//CTE
        //drive_2(new Audi());//CTE
        drive_2(new Gt650());
        drive_2(new Rx100());
        //drive_3(new Car());//CTS
        //drive_3(new Bike());//CTS
        //drive_3(new Gt650());//CTS
        //drive_3(new Rx100());//CTS
        //drive_2(new Bike());//CTS
    }
}

class Vehicle{}

class Car extends Vehicle{}
class Bike extends Vehicle{}

class Bmw extends Car{}
class Audi extends Car{}
class Benz extends Car{}

class Gt650 extends Bike{}
class Rx100 extends Bike{}


