public class RemoveSpaces {
    public static void main(String[] args) {
        String s =" java is   easy ";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }else{
                System.out.print(ch);
            }
        }
    }
}
