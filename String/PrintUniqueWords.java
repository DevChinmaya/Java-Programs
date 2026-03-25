//Write a program to print the unique words in a string?
// I/P: "Banaglore is Banaglore City"
// O/P: "is City"
public class PrintUniqueWords {
    public static void main(String[] args) {
        String s="Banaglore is Banaglore City";
        String[] str=s.split(" ");
        for(int i=0; i<str.length; i++){
            int count=1;
            if(str[i].equals("")) continue;
            for(int j=i+1; j<str.length; j++){
                if(str[i].equals(str[j])){
                    count++;
                    str[j] = "";
                }
            }
            if(count==1)
            System.out.print(str[i]+" ");
        }
    }
}
