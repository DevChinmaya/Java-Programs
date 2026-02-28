

class Student {
	String name;
	int age;
	int id;
	
	Student(String name , int age, int id){
	    this.name = name;
	    this.age = age;
	    this.id = id;
	}
	public void display() {
		System.out.println(name + "\n" + age + "\n" + id);
	}
	public static void main(String args[]) {	
		Student d1 = new Student("Ram",20,1);
		d1.display();
		Student d2 = new Student("Shyam",22,2);
		d2.display();
	}	
}

