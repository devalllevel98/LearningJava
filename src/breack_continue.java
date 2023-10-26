import java.util.Scanner;

public class breack_continue {

    public static int Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nahp vao gia tri N: ");
        int N = sc.nextInt();
        return N;
    }
    public static void main(String[] args) {
        int Sum = 0;
        int Number = Input();
        if(Number <=0){
            System.out.println("VUi long nhap lai so N.");
            Input();
        }else{
            for(int i=1; i <=Number; i+=2){
                if(i == 3){
                    continue;
                };
                Sum +=i;
            }
            System.out.println("Tong la: "+Sum);
        }
    }
}
