//論理演算子
public class sample16 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;


        System.out.println(a < 0 && b > 5); //false
        System.out.println(a < 5 && b > 3); //false
        System.out.println(a < 9 && b > 7); //false
        System.out.println(a < 9 && b > 3); //ture
        System.out.println("----------------");
        System.out.println(a < 0 || b > 5); //false
        System.out.println(a < 5 || b > 3); //true
        System.out.println(a < 9 || b > 7); //true
        System.out.println(a < 9 || b > 3); //true

        System.out.println(!(a > 0)); //false
        System.out.println(!(a > 9)); //true

        System.out.println("----------------");

        int num = 3;


        if (num > 5 && num < 10); {
            System.out.println("ok!");
        }
    }
}
