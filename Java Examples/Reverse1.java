import java.util.Stack;

// Reverse a String Using Stack
    
public class Reverse1{
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        
        char[] cr = str.toCharArray();

        for (char c: cr){
            stack.push(c);
        }

        for(int i=0;i<str.length();i++){
            cr[i] = stack.pop();
        }

        return new String (cr);
    }


    public static void main(String args[]){
        String strr = "JAVA";
        System.out.println(reverseString(strr));

    }
}
