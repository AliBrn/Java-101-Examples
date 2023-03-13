package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Sum of digits {
   // Bir sayının basamak  sayılarının toplamını hesaplayan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int nmbr= klavye.nextInt();
        int total=0,temp;
        while (nmbr!=0){
            temp=nmbr%10;
            nmbr/=10;
            total+=temp;
        }
        System.out.println("Basamak değeri toplamı:"+total);
    }
}
