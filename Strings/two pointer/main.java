
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            
            int left = 1;
            int right = n;
            
            for (int i = n; i >= 1; i--) {
                if ((n - i) % 2 == 0) {
                    p[i] = right--; 
                } else {
                    p[i] = left++;  
                }
            }
            
            for (int i = 1; i <= n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}