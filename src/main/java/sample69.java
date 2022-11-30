//文字列の中で指定した文字または文字列が出現するインデックスを取得する
public class sample69 {
    public static void main(String[] args) {
        //public int indexOf(int ch)
        //ch - 文字(Unicodeコード・ポイント)

        String str = "Hello World";
        System.out.println(str.indexOf((int)'o'));//4  何番目に対象の文字があるかを検索している

        //なお先頭の文字からではなく、指定したインデックスの位置から末尾に向かって調べる場合には引数の異なる次の indexOf メソッドを使用します。
        //public int indexOf(int ch, int fromIndex)
        //ch - 文字(Unicodeコード・ポイント)
        //fromIndex - 検索開始位置のインデックス

        String str1 = "Hello World";
        System.out.println(str1.indexOf((int)'o',5));//7  これは分からない

        //文字が最後に出現するインデックスを取得する
        //public int lastIndexOf(int ch)

        String str2 = "Hello World";
        System.out.println(str2.lastIndexOf((int)'o'));//7  これも分からない



    }

}
