//配列をコピーする(シャローコピーとディープコピー)
//エラーになっている
public class sample42 {
    public static void main(String[] args){

        MyTes[] src = {new MyTes(28), new MyTes(12)};
        MyTes[] dst = new MyTes[2];

        for (int i = 0; i < src.length; i++){
            dst[i] = new MyTes(src[i].num);
        }

        System.out.println("src[0] = " + src[0].num);  // 28
        System.out.println("dst[0] = " + dst[0].num);  // 28

        src[0].num = 41;

        System.out.println("src[0] = " + src[0].num);  // 41
        System.out.println("dst[0] = " + dst[0].num);  // 16
    }
}

class MyTes{
    public int num;

    public MyTes(int n){
        num = n;
    }
}