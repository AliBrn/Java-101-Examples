package patikajava.birinci_kisim;

import java.util.Scanner;

public class calculate_tax {
    // kdv tutarı  hesaplayan program
    public static void main(String[] args) {
        double tutar,kdvtutari,kdvlitutar;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Para değerini giriniz");
        tutar= klavye.nextDouble();
        if (tutar>0 && tutar<1000){
            kdvtutari=tutar*0.18;
            kdvlitutar=tutar+kdvtutari;
            System.out.println("KDV Oranı:"+0.18);
            System.out.println("KDV'siz Tutar:"+tutar);
            System.out.println("KDV Tutarı:"+ kdvtutari);
            System.out.println("KDV'li Tutar:"+kdvlitutar);

        }else{
            kdvtutari=tutar*0.08;
            kdvlitutar=tutar+kdvtutari;
            System.out.println("KDV Oranı:"+0.08);
            System.out.println("KDV'siz Tutar:"+tutar);
            System.out.println("KDV Tutarı:"+kdvtutari);
            System.out.println("KDV'li Tutar:"+kdvlitutar);


        }

    }
}
