//文字列の連結(+演算子)
public class sample18 {
    public static void main(String[] args) {
        System.out.println(45 + 18 + "point");
        System.out.println("point" + 45 + 18);
        System.out.println("point" + (45 + 18));


        //StringBuilderを使った文字列の連結
        StringBuilder sb = new StringBuilder();

        sb.append("XT");
        sb.append(3140);
        sb.append("-Y2");

        String name = sb.toString();
        System.out.println(name);

    }
}
