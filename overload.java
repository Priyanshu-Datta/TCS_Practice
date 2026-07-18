package TCS_Practice;

import java.util.*;
public class overload {
    public void count(int[] arr, int n){
        int count = 0;

        for(int i=0;i<n-2;i++){
            if(arr[i] < arr[i+1] && arr[i+1] < arr[i+2]){
                count ++;
            }
        }
        System.out.println("Result: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of houses");
        int n = sc.nextInt();

        System.out.println("enter the loads");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        overload obj = new overload();
        obj.count(arr, n);

        sc.close();
    }
}
