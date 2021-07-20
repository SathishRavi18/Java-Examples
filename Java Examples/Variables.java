import java.util.Scanner;

public class Variables {


    public static void main(String args []) {

        int variables = 2;
        // Data Types

        //byte data type - 8 bit
        //short data type - 16 bit


        int var = 3;  // 4 byte  
        char ch = 'a';  // 2 byte
        boolean bool = true;
        String str = "Sathish";
        float fl = 1.3f;
        System.out.println(fl);

        int number, sum =0;

        
        while(true)
        {
            Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
            if(number==5)
            break;
        }
        sum +=number;
    } 
        

    
}
