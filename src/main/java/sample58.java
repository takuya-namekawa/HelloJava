//ラッパークラスのvalueOfメソッドを使用する
public class sample58 {
    public static void main(String[] args) {
        String si = "42";
        String sd = "2.84";

        String sb = "false";

        int i = Integer.valueOf(si).intValue();
        double d = Double.valueOf(sd).doubleValue();
        boolean b = Boolean.valueOf(sb).booleanValue();

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);

    }
}
