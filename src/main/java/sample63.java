//文字列から開始と終了インデックスを指定して部分文字列を取得する
public class sample63 {
    public static void main(String[] args) {
        String m = "東京都港区赤坂";

        System.out.println(m.substring(3,5));//港区
        System.out.println(m.substring(5,7));//赤坂

        //開始インデックスをだけを指定して終了インデックスを省略
        String s = "東京都港区赤坂";

        System.out.println(s.substring(3));//港区赤坂

    }
}
