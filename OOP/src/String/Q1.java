package String;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.next();
        if(isPalindrome(input)){
            System.out.println("\"" + input + "\" is a palindrome");
        }else{
            System.out.println("\"" + input + "\" is not a palindrome");
        }
    }

    private static boolean isPalindrome(String input) { // tum ise public ya private kuch bhi karna
        int i = 0;
        int j = input.length()-1;
        while (i <= j){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
