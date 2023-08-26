import java.util.*;
public class paiza_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a % 3 == 0) {
                ans += 1;
            }
        }

        System.out.println(ans);






    }
}
