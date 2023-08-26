import java.util.*;
public class paiza_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int A = 0;

        for (int i = 0; i < N; i++) {
            A = scn.nextInt();
        }
        if (A == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
