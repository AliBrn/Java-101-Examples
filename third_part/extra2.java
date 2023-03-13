package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class extra2 {
    // Klavyeden girilen Stringin uzunluğu 5'den az olanları yan yana toplayan ve 5 oluncada bitiren Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String str= "",word;
        int sayac=0;

        while (sayac!=5){
            System.out.println("Kelime girin");
            word= klavye.next();
            if (word.length()<5){
                sayac++;
                str=str+word;
            }

        }
        System.out.println("Kelimeler:"+str);

    }
}
