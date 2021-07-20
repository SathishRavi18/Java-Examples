
//Replace the spaces with %20

//i/t- 
//o/t- 

/*Algorithm
Use the java builtin trim method to remove spaces in front and back of the string
Use replaceAll method to replace the spaces with %20



*/
import java.io.*;
import java.util.Arrays;



public class Hello {

    

 
    

public static void main (String args[]) {
Hello hello = new Hello();

String str1 = "geeks for geeks  ";

str1 = str1.trim();

str1 = str1.replaceAll("\\s", "%20");

System.out.println(str1);



}


}