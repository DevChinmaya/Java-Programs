
class Animal{
	public void eat() {
		System.out.println("Animal-Eat");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Dog-Barks");
	}
}
class BabyDog extends Dog{
	public void weeps() {
		System.out.println("Babydog-Weeps");
	}
}
public class AnimalDriver {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eat();
		d.bark();
		BabyDog b = new BabyDog();
		b.eat();
		b.bark();
		b.weeps();
	}
	
}
