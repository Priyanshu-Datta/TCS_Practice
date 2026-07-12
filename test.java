package TCS_Practice;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {

        int[] arr = {1, 0, 3, 0, 2, 2, 1, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i <= 3; i++) {
            System.out.println(i + " : " + map.get(i));
        }
    }
}
