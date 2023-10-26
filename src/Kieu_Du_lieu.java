public class Kieu_Du_lieu {
    public static void main(String[] args) {
        System.out.println("Kieu Du lieu Integer-MAX: "+Integer.MAX_VALUE);
        System.out.println("Kieu Du lieu Integer-MIN: "+Integer.MIN_VALUE);
        int a = 35;
        int b = 6;
        float result = (float) a/b;
        System.out.println("Result: \t"+result);
        int d = 9265;

        while (d >= 10){
            d = d/10;
        }
        if(d%2 == 0){
            System.out.println("Result1: \tD la so chan\t"+d);
        }else{
            System.out.println("Result: \tD la so le\t"+d);
        }
    }
}
