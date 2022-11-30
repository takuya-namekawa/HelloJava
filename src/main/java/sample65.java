import com.sun.security.jgss.GSSUtil;

//文字列に含まれる文字を大文字または小文字に変換する
public class sample65 {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "M o u s e";

        System.out.println(str1.toUpperCase());//APPLE
        System.out.println(str2.toUpperCase());//M O U S E

        String str3 = "Apple";
        String str4 = "M O U S E";

        System.out.println(str3.toLowerCase());//apple
        System.out.println(str4.toLowerCase());//m o u s e
    }
}
