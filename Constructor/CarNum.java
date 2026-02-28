

public class CarNum {
	String color;
	static int carNum=1000;
	int regNum;
	
	CarNum(String color){
		this.color = color;
		regNum = carNum++;
	}
	public static void main(String args[]) {
		CarNum c1 = new CarNum("Black");
		CarNum c2 = new CarNum("White");
		System.out.println(c1.color + "\t" + c1.regNum);
		System.out.println(c2.color + "\t" + c2.regNum);
		
		c2.regNum = 1111;
		System.out.println(c1.regNum + "\t" + c2.regNum);
	}
}
