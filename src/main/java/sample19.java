public class sample19 {
    public static void main(String[] args) {
        int sum = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("合計=" + sum);

        System.out.println("----------------");
        int i;


        for (i = 0; i < 2; i++){
            System.out.println("i=" + i);
        }

        System.out.println(i);


        System.out.println("----------------");

        int tasu = 0;

        for (int a = 1; ; a++) {
            tasu += a;
            if (tasu > 5) {
                break;
            }
        }

        System.out.println(tasu);
    }
}
