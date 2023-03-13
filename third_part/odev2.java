package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class odev2 {
    //Mükemmel Sayı bulan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int x= klavye.nextInt();
        int total=0;
        for (int i = 1; i <x; i++) {
           if (x%i==0){
               total=total+i;
           }
        }
        if (x==total){
            System.out.println("Sayı Mükemmel bir sayıdır");
        }else {
            System.out.println("Sayı Mükemmel bir sayı değil");
        }
    }
}
