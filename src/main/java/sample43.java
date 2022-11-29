//deep コピー
public class sample43 {
    public static void main(String[] args) {
        MyTest[] src = {new MyTest(28), new MyTest(12)};
        MyTest[] dst = new MyTest[2];

        for (int i = 0; i < src.length; i++){
            dst[i] = new MyTest(src[i].num);
        }

        System.out.println(src[0].num);
        System.out.println(dst[0].num);

        src[0].num = 41;

        System.out.println(src[0].num);
        System.out.println(dst[0].num);
    }
}

class MyTest{
    public int num;

    public MyTest(int n){
        num = n;
    }
}
