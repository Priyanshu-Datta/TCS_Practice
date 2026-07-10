package TCS_Practice;

import java.util.Scanner;

class solution{
    public boolean wordcheck(String s){
        if(allCapital(s) || allSmall(s.substring(1))){
            return true;
        }
        return false;
    }
    boolean allCapital(String s){
        boolean b = true;
        for(char ch : s.toCharArray()){
            if(ch < 'A' || ch > 'Z'){
                b = false;
            }
        }
        return b;
    }
    boolean allSmall(String s){
        boolean b = true;
        for(char ch : s.toCharArray()){
            if(ch < 'a' || ch > 'z'){
                b = false;
            }
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solution obj =new solution();
        System.out.println("enter a word");
        String s = sc.next();

        System.out.println(obj.wordcheck(s));
        sc.close();
    }
}