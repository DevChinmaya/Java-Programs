public class AnimalPark {
    public static void main(String[] args) {
        Animal a = new Cat();//Upcasting from cat to animal
        a.eat();
        //a.sound();
        //Dog d = (Dog) a;
        Cat c = (Cat)a;
        c.eat();
        c.sound();
        System.out.println("------------------");
        Animal a1 = new BabyDog();//Upcasting from babydog to animal
        a1.eat();//BabyDog Eat
        //a1.bark();//CTE
        //a1.weeps();//CTE
        

    }
}
class Animal{
    public void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog Eats");
    }
     public void bark(){
        System.out.println("Dog Barks");
    }
}
class BabyDog extends Dog{
    @Override
    public void eat(){
        System.out.println("BabyDog Eats");
    }
    @Override
    public void bark(){
        System.out.println("BabyDog Barks");
    }
    
    public void weeps(){
        System.out.println("BabyDog Weeps");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat Eats");
    }
    public void sound(){
        System.out.println("Cat Meows");
    }
}