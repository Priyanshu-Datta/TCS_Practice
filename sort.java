package TCS_Practice;

import java.util.HashMap;

public class sort {
    public void sortarray(int[] arr, int n){
        HashMap <Integer , Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num,0) + 1);
        }
    }
}
