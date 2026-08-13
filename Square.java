
 import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;

            for (int i = 0; i < 4; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
            }

            int side = maxX - minX;

            System.out.println(side * side);
        }

        sc.close();
    }
}
    
