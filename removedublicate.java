package TCS_Practice;

import java.util.HashMap;

public class removedublicate {
    public void remove(int[] arr){
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num , map.get(num) +1);
            }
            map.put(num , 1);
        }
        for(int i : map.keySet() ){
            if(map.get(i) == 1){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        int[] array = {1,2,3,1,2,3,4,5,6,7,8,9,7,8,9};
        removedublicate obj = new removedublicate();

        obj.remove(array);
    }
}
