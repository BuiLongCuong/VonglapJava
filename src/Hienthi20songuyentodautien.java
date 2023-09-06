import java.util.Scanner;

public class Hienthi20songuyentodautien {
    public static void main(String[] args) {
       int a=1;
       int countSNT=0;
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
           if(countSNT==20){
               break;
           }
       }
    }
}
