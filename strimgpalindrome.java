package TCS_Practice;

import java.util.Scanner;

public class strimgpalindrome {
    public boolean palindrome(String s){
        boolean b = true;
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                b = false;
            }

            i++;
            j--;
        }

        return b;
    }

    public static void main(String[] args) {
        strimgpalindrome obj = new strimgpalindrome();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("eneter a String");
        String s = sc.nextLine();

        boolean b = obj.palindrome(s);

        if(b){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
