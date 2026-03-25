public class AllSubstrFrom1stChar {
    public static void main(String[] args) {
        String s = "Ramana";
        for(int i=1; i<=s.length(); i++){
            System.out.println(s.substring(0,i));
        }
    }
}