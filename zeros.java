package TCS_Practice;

import java.util.*;
public class zeros {
    public void zerointheend(int[] arr , int n){
        int[] result = new int[n];
        int j =0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                result[j++] = arr[i];
            }
        }

        while(j<n){
            result[j++] = 0;
        }
        System.out.println("result:");
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }
        
    }

    public static void main(String[] args){
        zeros obj = new zeros();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the numbers  of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        obj.zerointheend(arr,n);
        sc.close();
    }
}
