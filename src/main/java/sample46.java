//2つの配列の要素の値を比較する(equals,deepEquals)
import java.util.Arrays;

public class sample46 {
    public static void main(String[] args) {
        int[] a = {85,78,92};
        int[] b = a;
        int[] c = {85,78,92};

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));
        System.out.println(Arrays.equals(b,c));
    }
}
