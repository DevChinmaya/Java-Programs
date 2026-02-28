
class AA{
	AA(){
		System.out.println("AA()-cons");
	}
}
class BB extends AA{
	
}
class CC extends BB{
	CC(){
		super();
		System.out.println("CC()-cons");
	}
}
public class Demo2 {
	public static void main(String[] args) {
		new CC();
	}
}
