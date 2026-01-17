public class DigitProduct {
    public static void main(String[] args) {
        int ans = digitpro(12134);
        System.out.println(ans);
    }

    static int digitpro(int n){
        if(n%10 == n){
            return n;
        }
        return ((n%10) * digitpro(n/10));
    }
}
