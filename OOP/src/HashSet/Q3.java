package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(read.nextInt());
        }
        int m = read.nextInt();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set2.add(read.nextInt());
        }
        HashSet<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println(set3);
        HashSet<Integer> set4 = new HashSet<>();
        for (int x : set2){
            if(set1.contains(x)){
                set4.add(x);
            }
        }
        System.out.println(set4);
        HashSet<Integer> set5 = new HashSet<>(set1);
        for(int x : set2){
            set5.remove(x);
        }
        System.out.println(set5);

    }
}
