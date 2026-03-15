public class toStringMethod {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Prem");
        System.out.println(s1);
    }
}
class Student{
    int id;
    String name;
    Student( int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString(){
        return "id:"+id+" name:"+name;
    }
}
