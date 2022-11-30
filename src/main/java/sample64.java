//文字列の先頭と末尾から空白文字を取り除く
public class sample64 {
    public static void main(String[] args) {
        //public String trim()
        String m = " AB CD ";

        System.out.println(m.trim());

        String msg1 = "\tAB CD\n";
        String msg2 = " AB CD ";

        System.out.println(msg1.trim());
        System.out.println(msg2.trim());
        System.out.println(msg1);
        System.out.println(msg2);

        String g = " AB CD ";

        System.out.println(g.strip());//strip()は全角も削除してくれる

        String ms = "　AB CD　";

        System.out.println(ms.strip());
        System.out.println(ms.stripLeading());//前方空白削除
        System.out.println(ms.stripTrailing());//後方空白削除
    }
}
