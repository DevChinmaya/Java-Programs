public class E1 {
    public static void main(String[] args) {
        System.out.println("Main starts");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("Handled");
        }
        System.out.println("Main ends");
    }
}
