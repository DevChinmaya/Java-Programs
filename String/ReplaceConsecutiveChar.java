//Replace the consectuive Characters with '$'
// i/p: BOSS      o/p: BOS$
// i/p: BOSSSS    o/p: BOS$S$
public class ReplaceConsecutiveChar {
    public static void main(String[] args) {
        String s="BOSSSS";
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length-1; i++){
            if(ch[i] == ch[i+1]){
                ch[i+1] = '$';
            }
        }
        System.out.println(ch);
    }
}
