public class Demo {
    public static void main(String[] args) {
        Regulator r = new Fan();
        r.increaseSpeed();
        r.decreaseSpeed();
        // r.on(); //CTE because it cannot access child class properties
        // r.off(); //CTE because it cannot access child class properties
        Fan f = (Fan) r;//BUT by downcasting we can solve this problem...
        f.on();//Now we can access child class properties both super and sub class properties
        f.off();//Now we can access child class properties both super and sub class properties
        f.increaseSpeed();
        f.decreaseSpeed();
    }
}

interface Regulator{
    void increaseSpeed();
    void decreaseSpeed();
}
interface Switch{
    void on();
    void off();
}
class Fan implements Regulator,Switch{
    @Override
    public void on(){
        System.out.println("Fan On");
    }
    @Override
    public void off(){
        System.out.println("Fan Off");
    }
    @Override
    public void increaseSpeed(){
        System.out.println("Speed Increased");
    }
    @Override
    public void decreaseSpeed(){
        System.out.println("Speed Decreased");
    }
}