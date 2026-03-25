//Write a program to print occurence of each word?
//I/P: "java us very very easy java"
//O/P: java=2 is=1 very=2 easy=1
public class OccurenceOfEachWord {
    public static void main(String[] args) {
        String s = "java is very very easy java";
        String str[] = s.split(" ");
        for(int i=0; i<str.length; i++){
            int count=1;
            if(str[i] == "") continue;
            for(int j=i+1; j<str.length; j++){
                if(str[i].equals(str[j])){
                    count++;
                    str[j] = "";
                }
            }
            System.out.println(str[i]+"="+count);
        }
    }
}
