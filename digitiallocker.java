package TCS_Practice;

import java.util.*;

public class digitiallocker {
    public void check(int n){
        int[] arr = new int[4];
        HashSet <Integer> set = new HashSet<>();
        int i = 3;
        while(n != 0){
            arr[i] = n % 10;
            set.add(arr[i]);
            i--;
            n = n/10;
        }
        int count = 0;
        for(int j=0;j<4;j++){
            if(arr[j] %2 == 0){
                count++;
            }
        }
        int sum = 0;
        for(int j=0;j<4;j++){
            sum += arr[j];
        }
        if(count == 2 && sum % 3 == 0 && arr.length == set.size()){
            System.out.println("OPEN");
        }else{
            System.out.println("LOCKED");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 4-digit no");
        int n = sc.nextInt();

        digitiallocker obj = new digitiallocker();
        obj.check(n);
        sc.close();
    }
}
