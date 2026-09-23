import java.util.*;

public class Stones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int answer = 0;

        for (int i = 1; i < n; i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                answer++;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}