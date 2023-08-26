import java.util.*;
public class paiza_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;

        String s = scn.nextLine();
        String[] strArray = s.split("");


        for (String sA: strArray) {
            System.out.println(sA);
            if (sA.equals("0")) {
                count += 24;
            }else if (sA.equals("1")) {
                count += 6;
            }else if (sA.equals("2")) {
                count += 8;
            }else if (sA.equals("3")) {
                count += 10;
            }else if (sA.equals("4")) {
                count += 12;
            }else if (sA.equals("5")) {
                count += 14;
            }else if (sA.equals("6")) {
                count += 16;
            }else if (sA.equals("7")) {
                count += 18;
            }else if (sA.equals("8")) {
                count += 20;
            }else if (sA.equals("9")) {
                count += 22;
            }
        }
        System.out.println(count);


    }
}
