
public class Demo7 {
	public static void main(String[] args) {
		new Y(12);
	}
}
class X{
	{
		System.out.println("Non static X");
	}
	X(){
		this(20);
		System.out.println("X() cons");
	}
	X(int i){
		System.out.println("X(int i) cons"+i);
	}
}
class Y extends X{
	{
		System.out.println("Non static Y");
	}
	Y(){
		System.out.println("Y() cons");
	}
	Y(int i){
		this();
		System.out.println("Y(int i) cons :"+i);
	}
}


