package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        while (true){
            String str = read.next();
            if(str.equals("done")){
                break;
            }else{
                set1.add(Integer.parseInt(str));
            }
        }
        while (true){
            String str = read.next();
            if(str.equals("done")){
                break;
            }else {
                set2.add(Integer.parseInt(str));
            }
        }
        if(set2.containsAll(set1)){
            System.out.println(set1 + " is a subset of " + set2);
        }else{
            System.out.println(set1 + " is not a subset of " + set2);
        }
    }
}
