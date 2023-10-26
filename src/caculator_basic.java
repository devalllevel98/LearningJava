import java.util.Scanner;

public class caculator_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri A = \t");
        int A = sc.nextInt();
        System.out.println("Nhap vao gia tri B = \t");
        int B = sc.nextInt();
        System.out.println("Nhap phep tinh caur 2 so A va B.");
        String cc = new Scanner(System.in).nextLine();
        switch (cc){
            case "+":
                System.out.println("Tong 2 so A va B la: \t"+Sum(A,B));
                ;break;
            case "-":
                System.out.println("Hieu 2 so A va B la: \t"+Subtraction(A,B));
                break;
            case "*":
                System.out.println("Hieu 2 so A va B la: \t"+Mutiplication(A,B));
                break;
            case "/":
                System.out.println("Hieu 2 so A va B la: \t"+Devision(A,B));
                break;
            default:
                System.out.println("Khong co phep tinh nay");
        }
    }

    public static int Sum(int a, int b){
        return a + b;
    }
    public static int Subtraction(int a, int b){
        return a - b;
    }
    public static float Devision(int a, int b){
        float result = 0;
        try {
            if(b==0){
                System.out.println("Phep chia voi mau so phai khac 0.");
            }else{
                result = (float) a/b;
            }
        }catch(Exception e){
            System.out.println("co loi roi");
            e.printStackTrace();
        }
        return result;
    }
    public static int Mutiplication(int a, int b){
        return a * b;
    }
}
