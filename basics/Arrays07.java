//count the number of elements strictly greater(not>= ,yes >) than the value of x
import java.util.Scanner;
public class Arrays07{
    static int countt(int[]arr, int x){
       int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
            
        }
        return count;

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("enter int x");
        int x =sc.nextInt();
        System.out.println();
        System.out.println("the number of elements strictly greater than x is: "+countt(arr, x));
    }
}