
class Animal{
	public void sound() {
		System.out.println("Animal sound");
	}
}
class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}
class BabyDog extends Dog {
	@Override
	public void sound() {
		System.out.println("BabyDog barks");
	}
}
class Cat extends Animal{
	@Override 
	public void sound() {
		System.out.println("Cat meows");
	}

}

public class AnimalDriver {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Dog d = new Dog();
		d.sound();
		BabyDog b = new BabyDog();
		b.sound();
		Cat c = new Cat();
		c.sound();
	}
}
