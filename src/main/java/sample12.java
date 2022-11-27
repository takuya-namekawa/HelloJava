//演算子の優先順位と結合規則
public class sample12 {
    public static void main(String[] args) {
        int n1 = 10 * 5 + 4;
        int n2 = 4 + 10 * 5;


        System.out.println("10 * 5 + 4 = " + n1);
        System.out.println("4 + 10 * 5 =" + n2);

        int n = 10 - 5 - 3;

        System.out.println("10 - 5 - 3 = " + n);

        int n3 = 10 + 8 / 2 * 4;
        int n4 = (10 + 8 / 2) * 4;
        int n5 = ((10 + 8) / 2) * 4;

        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }
}
