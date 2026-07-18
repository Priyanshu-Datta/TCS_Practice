package TCS_Practice;

import java.util.*;

public class msgDecoder {
    public void decode(String s){
        int n = s.length();

        char[] arr = new char[n];

        for(int i=0;i<n;i++){
            arr[i] = s.charAt(i);
        }

        String r = "";
        for(int i=0;i<n;i += 2){
            int num = arr[i] - '0';
            char c = arr[i + 1];
            for(int j=0;j<num;j++){
                r += c;
            }
        }

        System.out.println(r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the coded String");
        String s = sc.nextLine();

        msgDecoder obj = new msgDecoder();
        obj.decode(s);

        sc.close();
    }
}
