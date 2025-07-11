// count the number of occurences of particular element x //

import java.util.Scanner;
public class Arrays05{
    static int countOccurences(int[] arr, int x){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
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
        System.out.println("count of x:" + countOccurences(arr, x));
    }
}