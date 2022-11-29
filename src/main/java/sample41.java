//配列のすべての要素を指定した値で埋める(fill)
import java.util.Arrays;

public class sample41 {
    public static void main(String[] args) {
        int[] a = new int[3];
        Arrays.fill(a,10);


        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
