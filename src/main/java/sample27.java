//continue文の使い方
public class sample27 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            if (i % 3 == 0){
                continue;
            }


            System.out.println("i = " + i);
        }

        System.out.println("END");
    }
}
