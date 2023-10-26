import java.util.Scanner;

public class bai11_scanner {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Hay nhap vao 1 so nguyen: \t");
            int a = keyboard.nextInt();
            System.out.println("hay nhan vao so thap phan: \t");
            float b = keyboard.nextFloat();
            System.out.println("hay nhan vao ten cua ban: \t");
            String c = new Scanner(System.in).nextLine();
            System.out.println("result: \n\t"+"age:\t"+a+"\n\tpoint: \t"+b+"\n\tname: \t"+c);
        }catch (Exception e){
            System.out.println("nhap loi. Vui long nhap lai!");
        }
    }
}
