//空文字と int 型の値を + 演算子で連結することで、 int 型の値を文字列に変換
public class sample56 {
    public static void main(String[] args) {
        int i = 10;
        long l = 12L;
        double d = 7.82;
        boolean b = true;

        String si = "" + i;
        String sl = "" + l;
        String sd = "" + d;
        String sb = "" + b;

        System.out.println(si);
        System.out.println(sl);
        System.out.println(sd);
        System.out.println(sb);

    }
}
