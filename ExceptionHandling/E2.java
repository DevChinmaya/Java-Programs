public class E2 {
    public static void main(String[] args) {
        int[]a={1,2,3};
        try {
            System.out.println(a[a.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Handled");
        }
    }
}
