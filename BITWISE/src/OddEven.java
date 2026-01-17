import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number :");
        int a=read.nextInt();
        System.out.println(isOdd(a));

    }
    public static boolean isOdd(int a){
        return (a&1) == 1;
    }
}
