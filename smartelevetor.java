package TCS_Practice;

import java.util.*;
public class smartelevetor {
    public void calculatetime(int[] arr , int n){
        int time = 1;
        for(int i=1;i<n;i++){
            int initial = arr[i-1];
            if(initial == arr[i]){
                time += 1;
            }
            if(initial < arr[i]){
                for(int j = initial;j<arr[i];j++){
                    time += 2;
                }
                time += 1;
            }
            if(initial > arr[i]){
                for(int j = initial;j>arr[i];j--){
                    time += 2;
                }
                time += 1;
            }
        }
        System.out.println(time);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the floor number");
        int n = sc.nextInt();

        System.out.println("Enter the floors");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        smartelevetor obj = new smartelevetor();
        obj.calculatetime(arr,n);

        sc.close();
    }
}
