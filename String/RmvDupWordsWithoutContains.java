//Write a program to remove the duplicate words in a string?
// I/P: "Banaglore is Banaglore City"
// O/P: "Banaglore is City"
public class RmvDupWordsWithoutContains {
    public static void main(String[] args) {
        String s="Banaglore is Banaglore City";
        String[] str=s.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("")) continue;
            for(int j=i+1; j<str.length; j++){
                if(str[i].equals(str[j])){
                    str[j] = "";
                }
            }
            System.out.print(str[i]+" ");
        }
    }
}
