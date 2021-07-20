import java.util.Scanner;

public class Loops {

    // Display text five times
    public static void main( String args []) {
        for(int i =1; i <=5; i++){
            System.out.println("sam");
        }

        // print numbers 1 to 5

        for(int i =1; i<=5; i++)
        {
            System.out.println(i);
        }

        // sum of n natural numbers
        // 1+2+3+4+5=15

        //Scanner scanner = new Scanner (System.in);
        //int n = scanner.nextInt();
        int sum =0;
        for(int i=1;i<=5;i++)
        {
            sum = sum +i;
        }
        System.out.println(sum);

        int [] arr = {3,5,7,8};
        for(int number : arr)
        {
            System.out.println(number);
        }

        int n = arr.length;
        int sum1 =0;
        for(int i=0; i<n;i++)
        {
            sum1 = sum1 + arr[i];
        }
        System.out.println(sum1);

       /* Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no>1){
            System.out.println(no);

        }
        int no1 = sc.nextInt();
        if(no1>1){
            System.out.println(no1);

        }*/

        

        
    }

    

    
        
    
}