

public class Demo6 {
	public static void main(String[] args) {
		new Q(10);
	}
}
class P{
	P(){
		System.out.println("P() cons");
	}
	P(int i){
		System.out.println("P(i) cons"+i);
	}
}
class Q extends P{
	Q(){
		System.out.println("Q() cons");
	}
	Q(int i){
		//super(i); // here if we include super(i) then it will call P class 1 arg
		System.out.println("Q(i) cons: "+i);
	}
}


