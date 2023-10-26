import java.util.Scanner;

public class gaii_bai_tap_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao nam hien tai: ");
        int year = sc.nextInt();
        if((year %4 == 0 && year %100 != 0) || year %400 == 0){
            System.out.println("nam "+year+" la nam nhuan.");
        }else{
            System.out.println("nam "+year+" la nam khong nhuan.");
        }
    }
}
