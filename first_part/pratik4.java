package patikajava.birinci_kisim;

import java.util.Scanner;

public class pratik4 {
    // km cinsinde taksimetre açılış ücreti 10 min  ücret talebi 20
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        double total,perkm=2.20,startPrice=10.0;
        System.out.print("Gidilcek Mesafe Km Cinsinden:");
        double x=klavye.nextDouble();
        total=startPrice+(perkm*x);
        total=(total<20) ? 20:total;
        System.out.println("Toplam tutar:"+total);
    }
}
