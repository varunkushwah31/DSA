public class DigitSum {
    public static void main(String[] args) {

        int ans = digsum(12344);
        System.out.println(ans);

    }

    static int digsum(int n){
        if(n == 0){
            return 0;
        }
        return ((n%10) + digsum(n/10));
    }

}
