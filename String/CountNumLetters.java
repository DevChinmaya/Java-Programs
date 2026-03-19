public class CountNumLetters {
    public static void main(String[] args) {
        String s = "#Ram@39**$";
        int cntLetters = 0;
        int cntDigits = 0;
        int cntSpecialChars = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A'&& ch<='Z')){
                cntLetters++;
            }
            else if(ch >= '0' && ch <= '9'){
                cntDigits++;
            }
            else{
                cntSpecialChars++;
            }
        }
        System.out.println("Number of letters: "+cntLetters);
        System.out.println("Number of digits: "+cntDigits);
        System.out.println("Number of special characters: "+cntSpecialChars);
    }
}
