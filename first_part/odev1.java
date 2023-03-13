package patikajava.birinci_kisim;

import java.util.Scanner;

public class odev1 {
    // Vücut Kitle İndeksini Hesaplayan java programı
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Boyunuzu  metre cinsi giriniz:");
        double boy= klavye.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        int kilo= klavye.nextInt();
        double vctindex=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+vctindex);



    }
}
