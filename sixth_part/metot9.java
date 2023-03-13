package patikajava.metotlar;

import java.util.Scanner;

public class metot9 {
    // kendisine parametre olarak gelen  tek boyutlu sayısal dizinin en büyük  elemanı ve indisi yazan java programı
    public static void en_kucukbulma(int a[]){
        int max=a[0],indis=0;
        for (int i = 0; i <a.length ; i++) {
            if (max < a[i]){
                max=a[i];
                indis=i;
            }
        }
        System.out.println(max+"maksimumum değer"+indis+"indisi");


    }

    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
         int d[]=new int[7];
        for (int i = 0; i <7 ; i++) {
            d[i]= klavye.nextInt();
        }en_kucukbulma(d);

    }
}
