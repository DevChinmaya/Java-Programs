//Write a program to rearrange the characters of a string in the following order: special characters, numbers, uppercase letters, and lowercase letters. (without using any built-in methods)
public class RearrangeChars {
    public static void main(String[] args) {
        String s = "Ram@123#ANA";
        String u="";
        String l="";
        String n="";
        String sp="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch >= 'A' && ch<='Z'){
                u+=ch;
            }else if(ch >= 'a' && ch<='z'){
                l+=ch;
            }else if(ch >= '0' && ch<='9'){
                n+=ch;
            }else{
                sp+=ch;
            }
        }
        System.out.println(sp+n+u+l);
    }
}
