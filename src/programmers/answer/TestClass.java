package programmers.answer;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.*;

public class TestClass {
    public static void main(String [] args) {
        String[] name = new String [] {"may", "kein", "kain", "radi"};
        int[] yearning = new int[] {5, 10, 1, 3};
        String[][] photo = new String[][] {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new TreeMap<>();
        
        for(int i = 0; i < name.length; i++) {
            System.out.println( i + " " + name[i] + " " + yearning[i]);
            map.put(name[i] , yearning[i]);
        }
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map3 = new HashMap<>();


        BigDecimal num = BigDecimal.valueOf(150000);
        int[] test = new int[4];


        System.out.println(photo[1][3]);
        int size = photo.length;
        int[] result = new int[size];
        for(int i = 0; i< photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                System.out.println("photo["+ i + "]" + "[" + j +  "] = " + photo[i][j] );
                if(map.containsKey(photo[i][j])){
                    result[i] += map.get(photo[i][j]);
                }
            }
        }
    }

    public static int findIndex(String[] arr, String name) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(name)) {
                return i;
            }
        }
        return 0;
    }

    public static void swap(String[] arr, int index) {
        String temp = arr[index];
        arr[index] = arr[index -1];
        arr[index -1] = temp;
    }
}
