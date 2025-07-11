//implementing deep copy using .copyof()
import java.util.Scanner;
public class Arrays04{

    static void printArray(int[] arr){
     for(int i=0;i<arr.length;i++){          //prints the array
            System.out.print(arr[i]+" ");
    }
    System.out.println();  //prints a new line after printing the whole arrray
    }    
   public static void main(String[]args){
        // Scanner sc=new Scanner(System.in);
        // int n= sc.nextInt();
        int[] arr=new int[4];
         arr[0]=5;
         arr[1]=6;
         arr[2]=7;
         arr[3]=4;

        System.out.println("original array");
         printArray(arr);
        
         int[] arr2=Arrays.copyOf(arr, arr.length);//it asks two parameters, fisrt is= (whose copy we want to make) and second is =(upto which length we want to make copies)
         System.out.println("copied array arr2");
         printArray(arr2);

         //changing some values of arr2
         arr2[0]=0;
         arr2[1]=0;
         System.out.println("original array(arr) after changing arr2");
         printArray(arr);

         System.out.println("copied arr2 after changing arr2");
         printArray(arr2);
    }

    
}