import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1
     /*  String[] Arr1 = {"cat", "dog", "red", "is", "am"};
        String max = Arr1[0];
        for (int i = 0; i < Arr1.length; i++) {
            if (Arr1[i].length() > max.length()) {
                max = Arr1[i];
            }
        }
        for (int i = 0; i < Arr1.length; i++) {
            if (Arr1[i].length() == max.length())
                System.out.println(Arr1[i]);
        }*/


        //2 main
       /*int []arr={1,1,1,3,3,5};
        int number=input.nextInt();
        int N=Count(arr,number);
        System.out.println(N);*/


        //3
        /*int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        largest(arr, k);*/

        //4 main
      /* int[] Arr1={5,4,3,2,1};
        revers(Arr1);*/



}


        //2 mithod
 /*   public static int Count(int[] arr,int x)
        {
            int count = 0;
            for (int i=0; i<arr.length; i++)
                if (x == arr[i])
                    count=count+1;
            return count;
        }*/


   //3
   /* public static void largest(int[] arr, int k) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= (arr.length - k); i--)
        System.out.println(arr[i]);

    }*/
  //4
   /* public static void revers(int[] Arr1){
        System.out.println("Revers Of Array:");
        for(int i=Arr1.length-1;i>=0;i--)
            System.out.print(Arr1[i]);
    }*/



}
