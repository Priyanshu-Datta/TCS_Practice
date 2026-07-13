package TCS_Practice;

public class uniquenuber {
    public void unique(int[] arr){
        int xor = 0;

        for(int num : arr){
            xor ^= num;
        }

        System.out.println(xor);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,4,2};
        uniquenuber obj = new uniquenuber();

        obj.unique(arr);
    }
}
