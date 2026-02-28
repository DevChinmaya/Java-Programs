
class DD{
	DD(int i){
		System.out.println("DD(int i): "+i);
	}
}
class EE extends DD{
	EE(){
		super(10);
		System.out.println("EE(int i) cons ");
	}
}
public class Demo4 {
	public static void main(String[] args) {
		new EE();
	}
}

