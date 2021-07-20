import java.util.Stack;

// Reverse a String Using Stack
    
public class Reverse{
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        
        char[] cr = str.toCharArray();

        return String (cr);
    }


    public void main(String args[]){
        String str = "JAVA";
        System.out.prinln(reverseString(str));

    }
}
