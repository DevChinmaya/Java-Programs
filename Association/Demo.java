public class Demo {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.start();
    }
}
class Computer{
    CPU cpu;
    public Computer() {
        //this.cpu=new CPU();
    }
    public void start(){
        cpu.process();
        System.out.println("Computer starts");
    }
}
class CPU{
    public void process(){
        System.out.println("CPU processing...");
    }
}