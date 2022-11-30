import org.w3c.dom.ls.LSOutput;

//文字列の一部を別の文字や文字列に置換する
public class sample67 {
    public static void main(String[] args) {


        //public String replace(char oldChar, char newChar)
        //oldChar - 以前の文字
        //newChar - 新しい文字
        //対象の文字列の中にある 1 番目の引数で指定した文字を 2 番目の引数で指定した文字に置換した新しい文字列を戻り値として返します。

        String str = "Herro Java";
        System.out.println(str.replace('r', 'l'));//Hello Java

        //文字列を別の文字列で置換する
        //public String replace(CharSequence target,CharSequence replacement)
        //target - 置換されるchar値のシーケンス
        //replacement - char値の置換シーケンス

        String str1 = "東京都港区";
        System.out.println(str1.replace("港区","中央区"));//東京都中央区


        String str2 = "Herro Java";
        System.out.println(str2);
        System.out.println(str2.replace('r','l'));

        String str3 = "東京都港区";
        System.out.println(str3);
        System.out.println(str.replace("港区","中央区"));


    }

}
