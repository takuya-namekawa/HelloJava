//拡張for文(for-each文)を使って要素を順に取得する
public class sample24 {
    public static void main(String[] args) {
        String pref[] = {"北海道", "東京都", "神奈川県"};


        for (String str: pref){
            System.out.println(str);
        }
    }
}
