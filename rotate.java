package TCS_Practice;

// import java.util.Scanner;

public class rotate {
    public void leftRotate(int[] arr,int n,int k){
        reverse(arr,0,n);
        reverse(arr,0,k);
        reverse(arr,k,n);
    }
    public void reverse(int[] arr,int k, int n){
        int i = k;
        int j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        rotate obj = new rotate();
        // Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,2,3,4,5,6,7};

        obj.leftRotate(arr,7,3);

        for(int num : arr){
            System.out.println(num);
        }
    }
}
