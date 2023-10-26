import java.util.Scanner;

public class baita07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thang hien tai: ");
        int month = sc.nextInt();
        if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Tháng "+month+" là tháng có 30 ngày.");
        }else if(month == 2){
            System.out.println("Nhap vao nam cua hien tai: \t");
            int year = sc.nextInt();
            if(year%4 == 0 && year%100 !=0 || year%400 == 0){
                System.out.println("Thang "+month+ " la thang co 29 ngay.");
            }else{
                System.out.println("Thang "+month+ " la thang co 28 ngay.");
            }
        }else{
            System.out.println("Thang "+month+ " la thang co 31 ngay.");
        }
    }
}
