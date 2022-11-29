//配列の要素を昇順・降順にソートする(sort)
import java.util.Arrays;

public class sample49 {
    public static void main(String[] args) {
        int[] src = {12,24,18,35,21};
        System.out.println(Arrays.toString(src));

        Arrays.sort(src);
        System.out.println(Arrays.toString(src));

    }
}
