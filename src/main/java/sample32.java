//defaultラベルを利用する
public class sample32 {
    public static void main(String[] args) {

        int num = 4;

        switch(num){
            case 5:
                System.out.println("一等賞");
                break;
            case 2:
                System.out.println("二等賞");
            default:
                System.out.println("残念賞");

        }


        int sample = 10;

        switch(sample){
            case 1:
            case 3:
            case 5:
                System.out.println("大当たり");
                break;
            case 2:
            case 4:
                System.out.println("残念賞");
            default:
                System.out.println("論外");


        }
    }
}
