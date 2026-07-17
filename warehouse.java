package TCS_Practice;

import java.util.*;

public class warehouse {
    public void pairing(int[] arr, int n){
        int end = n-1;
        int start = 0;

        Arrays.sort(arr);
        int[][] pair = new int[n/2][2];
        int check = 0;

        for(int i=0;i<n/2;i++){
            pair[i][0] = arr[start];
            pair[i][1] = arr[end];

            start++;
            end--;
        }
        for(int i=0;i<(n/2)-1;i++){
            if(pair[i][0]+pair[i][1] != pair[i+1][0]+pair[i+1][1]){
                check = -1;
            }
        }
        if(n % 2 != 0){
            System.out.println(-1 + " Not possible");
        }else if(check == -1){
            System.out.println(-1 + " Not possible");
        }else{
            for(int i=0;i<n/2;i++){
                System.out.println("Pair"+ (i+1) + ":"+ pair[i][0] + " " + pair[i][1]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tye nuber of BOX");
        int n = sc.nextInt();

        System.out.println("enter the weights");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        warehouse obj = new warehouse();
        obj.pairing(arr, n);

        sc.close();
    }
}
