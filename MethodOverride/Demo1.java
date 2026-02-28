

class X{
	X(){
		System.out.println("X() cons");
	}
	public void m1(int i) {
		System.out.println("m1()-A");
	}
}

class Y extends X{
	Y(){
		System.out.println("Y() cons");
	}
	@Override
	public void m1(int y) {
		System.out.println("m1()-B: "+y);
	}

}
public class Demo1 {
	public static void main(String[] args) {
		Y y = new Y();
		y.m1(102);
		
	}
}
