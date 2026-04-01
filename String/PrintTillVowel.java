// There are vowels in between the string. And the output is substr starting from the first vowel till char before last vowel...
// Then from starting vowel to char before 2nd last vowel...It will continue till every substr completes from the 1st vowel...
// After that it will start the sme process from 2nd vowel from start...then 3rd untill last vowel  
//I/P: AskyEvkIplyOflyU
//O/P: 
// AskyEvkIplyOfly  AskyEvkIply  AskyEvk  Asky
// EvkIplyOfly      EvkIply      Evk
// IplyOfly         Iply
// Ofly  

public class PrintTillVowel {
    public static void main(String[] args) {
        String s="AskyEvkIplyOflyU";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                for(int j=i; j<s.length(); j++){
                    System.out.print(s.charAt(j));
                    for(int k=j+1; k<s.length(); k++){
                        char c1=s.charAt(k);
                        if(c1 == 'A' || c1=='E' || c1=='I' || c1=='O' || c1=='U'){
                            break;
                        }else{
                            System.out.print(c1);
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}


