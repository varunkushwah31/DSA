package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String str = read.next();
            if(str.matches("[a-zA-Z]+")){
                // "[a-zA-Z]+" humne only alphabets rakhne ke liye kara hai
                //agar String ke andar koi number ya special character hai toh loop break ho jeaga
                //aur yahi condition question me di thi
                list.add(str);
            }else{
                break;
            }
        }
        String item = read.next();
        int idx = list.lastIndexOf(item);
        if(idx == -1){
            System.out.println("Element not found");
        }else{
            System.out.println(idx);
        }
    }
}
