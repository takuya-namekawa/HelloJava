//文字列と文字列を比較する
public class sample59 {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = new String(msg1);

        System.out.println(msg1 == msg2);
        System.out.println(msg1.equals(msg2));
    }
}
