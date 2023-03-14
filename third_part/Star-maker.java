package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Star-maker {
    //Girilen sayı kadar yıldız yapan Java programı
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int satir = klavye.nextInt(); // ilk döngü satır sayısını girer /içindekide boşluk bırakmak için n-i formülü/ son döngü ise bize yıldız basar
         for (int i = 1; i <=satir ; i++) {
            for (int j = 0; j <(satir-i) ; j++) {
                System.out.print(" ");
            }
            for (int k =1; k <=(2*i)-1 ; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
     

    }
}


