//多次元配列の長さを取得する(length)
public class sampl40 {
    public static void main(String[] args) {
        int[][] num = {{87,54},{76,92,48,58,84}};

        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){
                System.out.println(num[i][j]);
            }
        }
    }
}
