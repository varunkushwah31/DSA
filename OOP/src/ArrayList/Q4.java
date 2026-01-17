package ArrayList;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Q4 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        list.add(13.4);
        list.add(33.4);
        list.add(53.4);
        list.add(63.4);
        int idx = read.nextInt();
        try{
            System.out.println(list.get(idx));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
