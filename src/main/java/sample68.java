//指定した区切り文字で複数の文字列を連結し新しい文字列を作成する
import java.util.List;

public class sample68 {
    public static void main(String[] args) {
        //public static String join(CharSequence delimiter, CharSequence...elements)
        //delimiter - 各要素を区切る区切り文字
        //elements - 結合する要素

        String str = String.join("-","Apple", "Grape", "Melon");
        System.out.println(str);//Apple-Grape-Melon

        //また join メソッドは 2 番目の引数にイテレータを指定するものも用意されています。書式は次のとおりです。
        //public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
        //delimiter - 結果となるString内のelementsのそれぞれを区切るために使用される文字シーケンス
        //elements - elementsが結合されるIterable

        List<String> strings = List.of("One", "two", "Three");
        String str1 = String.join(" * ", strings);
        System.out.println(str1);//One * two * Three

    }
}
