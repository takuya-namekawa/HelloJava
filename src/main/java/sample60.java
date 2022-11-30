//文字列と文字列の大きさを比較する(String.compareTo)
public class sample60 {
    public static void main(String[] args) {
        String str1 = "東京都港区";
        String str2 = "東京都港区";
        String str3 = "東京都";
        String str4 = "東京都中央区";

        System.out.println(str1.compareTo(str2));//0
        System.out.println(str1.compareTo(str3));//2
        System.out.println(str1.compareTo(str4));//8194??全く分からん！！

        System.out.println(str1.charAt(3) + ":" + Integer.toString(str1.charAt(3)));
        System.out.println(str4.charAt(3) + ":" + Integer.toString(str4.charAt(3)));

    }
}
