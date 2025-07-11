    //CONCEPT OF SHALLOW COPY

import java.util.Scanner;
public class Arrays01{

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

        // System.out.println("Enter"+n+"elements");
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();    //assigns values to the array
        // }
        System.out.println("original array");
         printArray(arr);
        
         int[]arr2=arr;  //trying to copy arr to arr2
         System.out.println("copied array arr2");
         printArray(arr2);

         //changing some values of arr2
         arr2[0]=0;
         arr2[1]=0;
         System.out.println("original array(arr) after changing arr2");
         printArray(arr);

         System.out.println("copied arr2 after changing arr2");
         printArray(arr2);

         //here we saw that original array also changed after copying arr2 becuse its called shallow copying where
         //where arr was in stack point to 5 6 7 4 values located in stack . when we created copy arr2 or arr then 
         //arr2 also pointed that same value 5 6 7 8 in heap . so both arr and  arr2 were pointing the same value 
         //so when we changed arr2 , arr also got changed . in short they are different reference variable but they are pointing
         //to the same memory adress present in heap . new mem is always allocated by using new keyword
    }
}