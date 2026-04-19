public class UserProgram {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(15);
        a.add(20);
        a.add(25);
        a.add(35);
        a.add(45);
        a.add(55);
        a.add(99,3);
        //10 15 30 20 25
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
