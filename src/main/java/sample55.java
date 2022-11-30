//int 型、 short 型、 long 型、 double 型、 boolean 型の値をそれぞれ String クラスの valueOf メソッドを使用して文字列に変換
public class sample55 {
    public static void main(String[] args) {
        int i = 10;
        short s = 21;
        long l = 12L;
        double d = 7.82;
        boolean b = true;

        String si = String.valueOf(i);
        String ss = String.valueOf(s);
        String sl = String.valueOf(l);
        String sd = String.valueOf(d);
        String sb = String.valueOf(b);

        System.out.println(si);
        System.out.println(ss);
        System.out.println(sl);
        System.out.println(sd);
        System.out.println(sb);

    }
}
