package TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        TreeMap<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String key = read.next();
            int value = read.nextInt();
            map.put(key,map.getOrDefault(key,0) + value);
        }
        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}
