import java.util.*;

public class HashMaping {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n;
        n = read.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = read.nextInt();
        }

        //precompute

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(mp.containsKey(key)){
                freq = mp.get(key);
            }
            freq++;
            mp.put(key,freq);
        }
        int q = read.nextInt();
        while (q-- != 0){
            int number = read.nextInt();
            if(mp.containsKey(number)){
                System.out.println(mp.get(number));
            }
            else{
                System.out.println(0);
            }
        }
    }
}
