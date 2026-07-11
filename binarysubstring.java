package TCS_Practice;

import java.util.Scanner;

public class binarysubstring {
    public int substringcount(String s){
        int count =0;
        int total = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '1'){
                count ++;
            }else{
                total = total + (count * (count+1) / 2);
                count = 0;
            }
        }

        total = total + (count * (count+1) / 2);

        return total;
    }

    public static void main(String[] args){
        binarysubstring obj = new binarysubstring();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary String");
        String s = sc.next();

        int result = obj.substringcount(s);
        System.out.println(result);

        sc.close();
    }
}
