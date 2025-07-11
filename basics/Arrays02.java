public class Arrays02{

    static void printArray(int[]arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void change_array(int[] arr){
       for(int i=0;i<arr.length;i++){
        arr[i]=0;
       }
    }
    static void changeVal(int a){
        a=100;
    }
    public static void main(String[]args){
        int a=5;
        changeVal(a);//actual values never pass in a method call. copy of that value passes. thats called passby value
        System.out.println(a); //prints 5 here because 
        int[] arr=new int[3];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;

        change_array(arr);// thats called passby value . array should print 5 6 7 but it prints 0 0 0 because(concept briefly explained in my notes)
        printArray(arr);
    }

}