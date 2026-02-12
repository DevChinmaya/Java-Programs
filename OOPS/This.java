

class This {
    int i;
    int j;
    public void display(){
        int i=1;
        int j = 2;
        System.out.println(i);
        System.out.println(j);
        System.out.println(this.i);
        System.out.println(this.j);
    }

    public static void main(String[] args) {
        This a1 = new This();
        This a2 = new This();
        a1.i=10;
        a1.j=20;
        a1.display();
        a2.display();
    }
}
