//文字列を数値に変換する
public class sample57 {
    public static void main(String[] args) {
        String si = "42";
        String sd = "2.84";
        String sb = "false";

        int i = Integer.parseInt(si);
        double d = Double.parseDouble(sd);
        boolean b = Boolean.parseBoolean(sb);

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);

    }
}
