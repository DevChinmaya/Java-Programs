import java.util.Stack;
public class BalancedParanthesis{
    public static void main(String[] args) {
        String s="[({){}]}";
        //String s="{[())]}";//"(){{}}[]]";
        System.out.println(isBalanced(s));
    }
    public static boolean isBalanced(String s){
        Stack<Character> st=new Stack<Character>();
        if(s.length()%2 != 0)return false;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(' ){
                st.push(ch);
            }else if(ch=='}' || ch==')' || ch==']'){
                char ch1 = st.pop();
                if(!isPair(ch1,ch))
                    return false;
            }
        }
        return st.isEmpty();
    }
    public static boolean isPair(char ch1,char ch){
        if(ch1 == '{' && ch=='}' || ch1=='[' && ch==']' || ch1=='(' && ch==')'){
            return true;
        }
        return false;
    }
}