//文字列の文字の数(コードポイントの数)を取得する
public class sample62 {
    public static void main(String[] args) {
        String msg1 = "東京都港区赤坂";
        String msg2 = "齦あ";

        System.out.println(msg1.codePointCount(0,msg1.length()));
        System.out.println(msg2.codePointCount(0,msg2.length()));
    }
}
