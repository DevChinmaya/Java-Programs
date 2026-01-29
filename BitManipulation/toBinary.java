
class A {
    public String toBinary(int n) {
        String s = "";
        while(n!=0){
            if(n%2==1){
                s += "1";
            } else {
                s += "0";
            }
            n = n / 2;
            
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        A b = new A();
        A b1 = new A();
        String c =b1.toBinary(112);
        System.out.println(b.toBinary(18));
        System.out.println(c);
    }
}
