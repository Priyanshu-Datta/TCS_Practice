package TCS_Practice;

import java.util.HashMap;

public class twosum {
    public int[] sum(int[] arr, int target){
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i=0;i<n;i++){
            int val = target-arr[i];
            if(map.containsKey(val)){
                return new int[]{map.get(val) , i};
            }
            map.put(arr[i],i);
        }

        return new int[]{};
    }
    public static void main(String[] args){
        twosum obj = new twosum();
        int[] arr = {1,4,5,9,2,11,22};
        int target = 6;

        int[] result = obj.sum(arr,target);
        
        System.out.println(result[0]+" "+result[1]);
    }
}
