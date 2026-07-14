package TCS_Practice;

public class missingnumber {
    public void missing(int[] arr){
        int max = arr[0];
        int n = arr.length;
        int sum1 = 0;
        int sum2 = 0;

        for(int num : arr){
            sum1 += num;
        }

        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i=1;i<=max;i++){
            sum2 += i;
        }

        int miss = sum2 - sum1;

        System.out.println(miss);
    }

    public static void main(String[] args){
        int[] arr ={1,3,4,5,6,7};
        missingnumber obj = new missingnumber();

        obj.missing(arr);
    }
}
