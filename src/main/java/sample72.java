//文字列の中の正規表現パターンとマッチする部分を置換する
public class sample72 {
    public static void main(String[] args) {
        //public String replaceFirst(String regex, String repleacement)
        //regex - この文字列との一致を判定する正規表現
        //replacement - 最初に一致するものに置き換えられる文字列

        String regex = "aA|Aa|aa";
        String str = "AA BB aA Aa CC aa";

        System.out.println(str.replaceFirst(regex, "AA"));//AA BB AA Aa CC aa

        //public String replaceAll(String regex, String replacement)
        //regex - この文字列との一致を判定する正規表現
        //replacement - 一致するものそれぞれに置き換えられる文字列


        String regex1 = "aA|Aa|aa";
        String str1 = "AA BB aA Aa CC aa";

        System.out.println(str1.replaceAll(regex, "AA"));//AA BB AA AA CC AA


    }
}
