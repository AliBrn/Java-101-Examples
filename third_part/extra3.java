package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class extra3 {
    // Klavyeden girilen Stringden kaç tane kelime oldugunu bulan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Cümle  giriniz");
        String str= klavye.nextLine();  // nextLine() olduguna dikkat et next sadece ilk boşluğa kadar okur.
        int sayac=1;      // 1 aldık çünkü ilk kelimede boşluk olmaz.
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i)==' '){
                sayac++;
            }
        }
        System.out.println("Kelime sayısı:"+sayac);
    }
}
