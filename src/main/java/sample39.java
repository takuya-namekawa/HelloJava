//多次元配列の初期化
public class sample39 {
    public static void main(String[] args) {
        int[][] num = {{87,54,67},{76,92,48}};

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(num[i][j]);
            }
        }
    }
}
