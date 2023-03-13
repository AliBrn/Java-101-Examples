package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class extra1 {
    // Klavyeden kaç tane yan yana aa sayı bulan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir kelime girin");
        String x= klavye.next();
        int sayac=0;
        for (int i = 0; i <x.length()-1 ; i++) {  //Kelimenin bir eksiğinde  hata vermemesi için
            if (x.charAt(i)=='a'&& x.charAt(i+1)=='a'){
                sayac++;
                i++;                              //i yi de arttırma detayı var çünkü arttırmasan yan yana aaa yı 2 sayar 1 yerine
            }
        }
        System.out.println("aa sayısı:"+sayac);

    }
}
