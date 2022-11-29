//配列の指定範囲の要素から新しい配列を作成する(copyOfRange)
import java.util.Arrays;

public class sample44 {
    public static void main(String[] args) {
        int[] src = {12,24,18,35,21};
        int[] dst = Arrays.copyOfRange(src,1,4);

        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dst));

    }
}
