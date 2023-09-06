import java.util.Scanner;

public class Hienthicacsonguyentonhohon100 {
    public static void main(String[] args) {
        Scanner inputNumber= new Scanner(System.in);
        System.out.println("Các số nguyên tố bé hơn số bạn muốn nhập: ");
        int number = inputNumber.nextInt();
        int a=1;
        int countSNT=0;
        System.out.println("Sau đây là các số lượng số nguyên tố phù hợp với yêu cầu: ");
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
            if(a>=number){
                break;
            }
        }
    }
}
