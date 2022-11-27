//算術演算子
public class sample10 {
    public static void main(String[] args) {
        System.out.println("10 + 4 =" + (10 + 4));
        System.out.println("9 - 2 =" + (9 - 2));
        System.out.println("3 * 8 =" + (3 * 8));
        System.out.println("7 / 3 =" + (7 / 3));
        System.out.println("7 % 3 =" + (7 % 3));

        int num1 = 10;
        int num2 = 4;

        System.out.println(num1 / num2);
        System.out.println(num1 / (double)num2);

        System.out.println(10.0f / 0);
        System.out.println(10.0f % 0);
    }
}
