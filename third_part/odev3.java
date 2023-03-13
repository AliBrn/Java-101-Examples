package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class odev3 {
    //Yıldızları tersten yapan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sayı giriniz");
       int  satir= klavye.nextInt();
        for (int i = satir; i >= 0; i--) {
            for (int a = satir - i; a > 0; a--) {
                System.out.print(" ");
            }
            for (int x = (2 * i + 1); x > 0; x--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
