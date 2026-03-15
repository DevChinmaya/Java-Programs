public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Prem");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}
class Student{
    private int id;
    private String name;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
}