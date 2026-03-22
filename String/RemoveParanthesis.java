//Remove brackets from an algebraic string containing + and - operators
// Input:"(a - (b + c) + d)"
// Output: "a- b - c + d"
// Explanation: a - (b + c) + d simplifies to a - b - c + d

public class RemoveParanthesis {
    public static void main(String[] args) {
        String s = "(a - (b + c) + d)";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<s.length(); i++){  
            if(s.charAt(i)=='('){
                if(s.charAt(i-1)=='-'){
                    for(int j=i+1; j<s.length(); j++){
                        if(s.charAt(j) == ')'){
                            break;
                        }else if(s.charAt(j) == '+'){
                            sb.append('-');
                        }else if(s.charAt(j) == '-'){
                            sb.append('+');
                        }
                        sb.append(s.charAt(j));
                    }
                }else{
                    for(int j=i+1; j<s.length(); j++){
                        if(s.charAt(j) == ')'){
                            break;
                        }
                        sb.append(s.charAt(j));
                    }
                }
            }else if(s.charAt(i)!=')'){
                 sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
// import java.util.*;

// public class RemoveParanthesis {
//     public static void main(String[] args) {
//         String s = "(a - (b + c) + d)";
//         System.out.println(removeParentheses(s));
//     }

//     static String removeParentheses(String s) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(1); // initial sign context

//         int sign = 1;
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (ch == ' ') continue;

//             if (ch == '+') {
//                 sign = stack.peek();
//             } 
//             else if (ch == '-') {
//                 sign = -stack.peek();
//             } 
//             else if (ch == '(') {
//                 stack.push(sign);
//             } 
//             else if (ch == ')') {
//                 stack.pop();
//             } 
//             else {
//                 // variable
//                 if (sign == 1) {
//                     if (result.length() > 0) result.append("+");
//                     result.append(ch);
//                 } else {
//                     result.append("-").append(ch);
//                 }
//             }
//         }

//         return result.toString();
//     }
// }