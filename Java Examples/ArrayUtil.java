import java.util.Scanner;

public class ArrayUtil {
    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public int minn(int arr[]) {
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }




    
    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            
        }
        array.printArray(arr);
        System.out.println(array.minn(arr));
        
        



        
        
    }
    
}
