//配列の要素を降順にソートする
import java.util.Arrays;

public class sample50 {
    public static void main(String[] args) {
        int[] src = {12,24,18,35,21};
        System.out.println(Arrays.toString(src));

        Arrays.sort(src);

        for (int f = 0, l = src.length - 1; f < l; f++,l--){
            int temp = src[f];
            src[f] = src[l];
            src[l] = temp;

            System.out.println(Arrays.toString(src));
        }
    }
}
