import java.util.*;

public class Helpful {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int one = 0;
        int two = 0;
        int three = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                one++;
            } else if (s.charAt(i) == '2') {
                two++;
            } else if (s.charAt(i) == '3') {
                three++;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < one; i++) {
            ans.append("1+");
        }

        for (int i = 0; i < two; i++) {
            ans.append("2+");
        }

        for (int i = 0; i < three; i++) {
            ans.append("3+");
        }

        // Remove the final '+'
        ans.deleteCharAt(ans.length() - 1);

        System.out.println(ans);

        sc.close();
    }
}