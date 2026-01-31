class demo1{
    public static void main(String[] args) {
        m1(5);
        m1(4.5f);
        m1(9.6);
        m1('A');
        m1(5+3.3);

    }
    public static void m1(double d){
        System.out.println("m1(double d) : "+d);
    }
}