public class UserProgram {
    public static void main(String[] args) {
        StackUsingArrayList a=new StackUsingArrayList();
        a.push(10);
        a.push(15);
        a.push(20);
        a.push(25);
        System.out.println(a.pop());
        System.out.println(a.peek());
        System.out.println(a.peek());
    }
}
