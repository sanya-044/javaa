// find the last occurence of an element x in a given array
import java.util.Scanner;
public class Arrays06{
    static int lastOccurences(int[]arr, int x){
        int lastindex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        System.out.println("enter x");
        int x= sc.nextInt();
        System.out.println("element x is returning last at index:" + lastOccurences(arr, x));
    }
}
