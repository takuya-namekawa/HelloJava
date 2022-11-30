//文字列全体が正規表現パターンとマッチするか調べる
public class samole70 {
    public static void main(String[] args) {
        //public boolean matches(String regex)
        //regex - この文字列との一致を判定する正規表現

        String str = "Apple";
        String regex = "A.*e";
        System.out.println(str.matches(regex));//true

        String str1 = "Apple";
        String regex1 = "A.*o";
        System.out.println(str1.matches(regex1));//false


        System.out.println("---------");

        String str2 = "airplane.png";
        String str3 = "lemon.png";
        String str4 = "apple.jpeg";
        String regex2 = "a.+png$";

        System.out.println(str2.matches(regex2));//true
        System.out.println(str3.matches(regex2));//false
        System.out.println(str4.matches(regex2));//false

        //今回は a から始まり、任意の文字が 1 回以上続き、 png が続く文字列とマッチするパターンを定義しました。 3 つの文字列に対してそれぞれ matches? メソッドを実行し、最初の文字列だけがパターンとマッチしました。


    }
}
