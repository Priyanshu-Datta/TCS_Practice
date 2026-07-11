package TCS_Practice;

import java.util.Scanner;

public class togglebulb {
    public void toggle(int n){
        int[] arr = new int[n+1];

        for(int i=1;i<=n;i++){
            arr[i] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i*j <= n && arr[i*j] == 0 ){
                    arr[i*j] = 1;
                }else if(i*j <= n && arr[i*j] == 1 ){
                    arr[i*j] = 0;
                }
            }
        }

        int count = 0;
        for(int i=1;i<=n;i++){
            if(arr[i] == 1){
                count++;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args){
        togglebulb obj = new togglebulb();
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter the no of bulb");
        int n = sc.nextInt();

        obj.toggle(n);

        sc.close();
    }
}
