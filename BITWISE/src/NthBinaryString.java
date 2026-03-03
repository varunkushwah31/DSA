public class NthBinaryString {
    public static void main(String[] args) {

        int n = 10;

        StringBuilder[] arr = new StringBuilder[n];

        arr[0] = new StringBuilder("0");

        for (int i = 1; i < n; i++) {

            StringBuilder previous = arr[i - 1];
            StringBuilder reversedInverted = new StringBuilder();

            for (int j = previous.length() - 1; j >= 0; j--) {
                char c = previous.charAt(j);
                reversedInverted.append(c == '0' ? '1' : '0');
            }
            arr[i] = new StringBuilder();
            arr[i].append(previous);
            arr[i].append("1");
            arr[i].append(reversedInverted);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("S" + (i + 1) + " = " + arr[i]);
        }
    }
}