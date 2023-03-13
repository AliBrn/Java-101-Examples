package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class pratik10 {
    //Girilen sayı kadar yıldız yapan Java programı
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int satir = klavye.nextInt();
        // ilk döngü satır sayısını girer /içindekide boşluk bırakmak için n-i formülü/ son döngü ise bize yıldız basar.
        System.out.println("Bir sayi girin");

        for (int i = 0; i <satir; i++) {
            for (int a = 0; a < satir - i; a++) {
                System.out.print(" ");
            }
            for (int m = 0; m < (2 * i + 1); m++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
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


