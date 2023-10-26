public class bai9_toan_tu_logic {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a++ - ++b + ++a + ++b - 2;
        //3 - 5 +5 -2
        System.out.println("result: \t"+c);
    }
}
