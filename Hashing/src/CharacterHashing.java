import java.util.*;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s;
        s = read.next();
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        int q;
        q = read.nextInt();
        while (q-- != 0){
            char c;
            c = read.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
}
