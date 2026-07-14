package TCS_Practice;

public class insertposition {
    public void find(int[] arr ,int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(target < arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(low);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int target = 2;

        insertposition obj = new insertposition();
        
        obj.find(arr,target);
    }
}
