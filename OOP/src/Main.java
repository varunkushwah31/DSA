import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        Set<Integer> set = new HashSet<>();
        System.out.println(isHappy(7,set));
    }
    private static int happy(int n){
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum += rem*rem;
            n = n/10;
        }
        return sum;
    }
    private static boolean isHappy(int n, Set<Integer> set){
        if(n == 1) return true;
        if(set.contains(n)) return false;
        set.add(n);
        return isHappy(happy(n),set);
    }
}