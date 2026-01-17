package ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q3 {
    private static LinkedHashSet<Integer> set1;

    public static void main(String[] args) {
        //you are given 2 java object list write the java program that uses linkedHashSet that perform the following operation.
        //while preserving insertion order.
        //union all the unique elements on the list.
        //intersection of all the elements.
        //difference of elements that are not in list2 but in list1.
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(1);
        set2.add(2);
        set1.add(9);
        set1.add(7);
        //Q1
//        System.out.println(set1);
//        System.out.println(set2);
//        set1.addAll(set2);
//        System.out.println(set1);

        //Q2
//        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
//        for(int x : set1){
//            if(set2.contains(x)){
//                set3.add(x);
//            }
//        }
//        System.out.println(set3);

        //Q3
//        String str1 = "listen";
//        String str2 = "silent";
//        System.out.println(isAnagram(str1,str2));
//    }
//
//    public static boolean isAnagram(String str1, String str2){
//        HashMap<Character,Integer> map = new HashMap<>();
//        if(str1.length() != str2.length()){
//            return false;
//        }
//        for(char ch : str1.toCharArray()){
//            map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//        for (char ch : str2.toCharArray()){
//            if(!map.containsKey(ch)){
//                return false;
//            }
//            if(map.get(ch) < 0){
//                return false;
//            }
//            map.put(ch, map.get(ch) -1);
//        }
//        return true;
//    }
//}

//write a Java Program to count the frequency of each word in a sentence using HashMap.
//write a Java Program to find the short string in a list of string.
    }
}
