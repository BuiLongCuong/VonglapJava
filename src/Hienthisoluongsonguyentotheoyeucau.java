import java.util.Scanner;

public class Hienthisoluongsonguyentotheoyeucau {
    public static void main(String[] args) {
        Scanner inputNumber= new Scanner(System.in);
        System.out.println("Số lượng số nguyên tố bạn muốn hiện: ");
        int quantity = inputNumber.nextInt();
        int a=1;
        int countSNT=0;
        System.out.println("Sau đây là số lượng số nguyên tố mà bạn đã yêu cầu: ");
        while (true){
            int countUoc=0;
            for (int i = 1; i <=a; i++) {
                if(a%i==0){
                    countUoc++;
                }
            }if(countUoc==2){
                countSNT++;
                System.out.println(a);
            }a++;
            if(countSNT==quantity){
                break;
            }
        }
    }
}
