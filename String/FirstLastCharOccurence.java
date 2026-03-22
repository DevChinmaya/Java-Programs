public class FirstLastCharOccurence {
    public static void main(String[] args) {
        String s = "javadev";
        char f=s.charAt(0);
        char l=s.charAt(s.length()-1);
        String s1="";
        String s2="";
        s1 = s.replace(f+"","");
        s2 = s.replace(l+"","");

        System.out.println(f+": "+(s.length()-s1.length()));
        System.out.println(l+": "+(s.length()-s2.length()));
    }
}
