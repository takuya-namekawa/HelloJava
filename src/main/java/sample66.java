//文字列の最後に別の文字列を連結する
public class sample66 {
    public static void main(String[] args) {
        //public String concat(String str)
        //str - このStringの最後に連結されるString

        String  str1 = "東京都";
        String  str2 = "港区";

        System.out.println(str1.concat(str2));//東京都港区

        //+演算子を使った文字列の連結
        String str3 = "東京都";
        String str4 = "港区";

        System.out.println(str3 + str4);//東京都港区

        String str5 = "東京都";

        System.out.println(str5.concat("港区赤坂"));//東京都港区赤坂
        System.out.println(str5 + "港区赤坂");//東京都港区赤坂


    }
}
