package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class pratik1 {
    //0 dan başlayıp girilen sayıya kadar 3 ve 4 e tam bölenlerin ortalamasını hesaplayan Java Program(0' dan  başladıgı için 1 fazla sayac)
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        double ortalama;
        int toplam=0,sayac=0;
        int x= klavye.nextInt();
        for (int i = 0; i <=x ; i++) {
            if (i%3==0 && i%4==0){
                toplam+=i;
                sayac++;
            }

        }
        ortalama=toplam/sayac;
        System.out.println("Ortalaması:"+ortalama);
    }
}
