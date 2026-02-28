
public class Car {
	static int count=0;
	Car(){
		count++;
	}
	public static void main(String args[]) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		new Car();
		System.out.println("Number of objects created is: "+ count);
	}
}
