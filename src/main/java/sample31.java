//switch文を使った条件分岐
public class sample31 {
    public static void main(String[] args) {
        int[] classcode = {1,2,3};
        String[] name = {"鈴木","本田","遠藤"};


        for (int i = 0; i < 3; i++){
            System.out.println(name[i] + "さんは");

            switch(classcode[i]){
                case 1:
                    System.out.println("Aクラスです");
                    break;
                case 2:
                    System.out.println("Bクラスです");
                    break;
                case 3:
                    System.out.println("Cクラスです");
            }
        }
    }
}
