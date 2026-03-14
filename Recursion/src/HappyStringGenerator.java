public class HappyStringGenerator {

    private int count = 0;
    private String answer = "";

    public String getHappyString(int n, int k) {
        backtrack(new StringBuilder(), n, k);
        return answer;
    }

    private void backtrack(StringBuilder curr, int n, int k) {
        if (!answer.isEmpty()) return;

        if (curr.length() == n) {
            count++;
            if (count == k) {
                answer = curr.toString();
            }
            return;
        }

        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (curr.length() > 0 && curr.charAt(curr.length() - 1) == ch) {
                continue;
            }

            curr.append(ch);
            backtrack(curr, n, k);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public static void main(String[] args) {

        HappyStringGenerator generator = new HappyStringGenerator();

        int n = 3;
        int k = 9;

        String result = generator.getHappyString(n, k);
        System.out.println("Result: " + result);

        /*
        Test Cases:

        1)
        n = 1, k = 1
        Output: "a"

        2)
        n = 1, k = 2
        Output: "b"

        3)
        n = 1, k = 3
        Output: "c"

        4)
        n = 3, k = 1
        Output: "aba"

        5)
        n = 3, k = 2
        Output: "abc"

        6)
        n = 3, k = 3
        Output: "aca"

        7)
        n = 3, k = 4
        Output: "acb"

        8)
        n = 3, k = 9
        Output: "cab"

        9)
        n = 3, k = 10
        Output: ""   (k exceeds number of happy strings)

        10)
        n = 2, k = 5
        Output: "ca"

        11)
        n = 4, k = 1
        Output: "abab"

        12)
        n = 4, k = 10
        Example Output: depends on order but valid happy string
        */
    }
}