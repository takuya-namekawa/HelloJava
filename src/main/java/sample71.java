//文字列を正規表現パターンを使って分割する
//これは分からない
public class sample71 {
    public static void main(String[] args) {
        //public String[] split(String regex, int lomit)
        //regex - 正規表現の区切り
        //limit - 結果のしきい値

        String regex = ";|:";
        String str = "赤色:青色:黄色:;";

        String[] result = str.split(regex, 0);
        for (int i  = 0 ; i < result.length; i++){
            System.out.println("[" + result[i] + "]");
        }

        System.out.println("-------");


        result = str.split(regex, -1);
        for (int i = 0; i < result.length; i++){
            System.out.println("[" + result[i] + "]");
        }

        System.out.println("-------");

        result = str.split(regex, 2);
        for (int j = 0; j <result.length; j++){
            System.out.println("[" + result[j] + "]");
        }



    }
}
