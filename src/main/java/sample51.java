//配列の文字列表現を取得する
//下段は多次元配列の場合
import java.util.Arrays;

public class sample51 {
    public static void main(String[] args) {
        double[] src = {3.75,0.52,14.1};
        int[][] sample = {{25,18},{12,37}};

        System.out.println(src);
        System.out.println(sample);

        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.deepToString(sample));
    }
}
