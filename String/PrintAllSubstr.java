//Print all substr of a String?
//Substr contains minimum of 3 chars

public class PrintAllSubstr {
    public static void main(String[] args) {
        String s = "malayalam";
        for(int i=0; i<s.length(); i++){
            for(int j=i+3; j<s.length(); j++){
                String str = s.substring(i,j); 
                System.out.println(str);
            }
        }
    }
}
