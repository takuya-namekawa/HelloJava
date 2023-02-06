public class Sub extends Su{
    private int num = 20;
    void test() {
        System.out.println(num);
    }
    public static void main(String[] args) {
        Sub s = new Sub();
        s.test();
        s.te();
    }
}
