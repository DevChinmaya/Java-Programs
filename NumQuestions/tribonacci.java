public class tribonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;

        System.out.print(a+" "+b+" "+c+" ");
        for(int i=3; i<=10; i++){
            int d = a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
}
