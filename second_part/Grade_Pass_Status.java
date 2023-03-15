package patikajava.ikinci_kisim;

import java.util.Scanner;

public class Grade_Pass_Status {
    //Girilen 5 dersin ortalamasını hesaplayıp 0 la 100 olanları ortalamaya katan java programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int mzk,mat,kmy,fzk,trkce,toplam=0,ders=0;
        System.out.println("Müzik notunu girin");
         mzk=klavye.nextInt();
        if (mzk>0 && mzk<100 ){
            toplam+=mzk;
            ders++;
        }
        System.out.println("Matematik notunu girin");
         mat=klavye.nextInt();
        if (mat>0 && mat<100 ){
            toplam+=mat;
            ders++;
        }
        System.out.println("Türkçe notunu girin");
         trkce=klavye.nextInt();
        if (trkce>0 && trkce<100 ){
            toplam+=trkce;
            ders++;
        }
        System.out.println("Kimya notunu girin");
         kmy=klavye.nextInt();
        if (kmy>0 && kmy<100 ){
            toplam+=kmy;
            ders++;
        }
        System.out.println("Fizik notunu girin");
         fzk=klavye.nextInt();
        if (fzk>0 && fzk<100 ){
            toplam+=fzk;
            ders++;
        }
        double ortalama=toplam/ders;
        if (ortalama<50){
            System.out.println("Kaldınız");
        }else{
            System.out.println("Geçtiniz");
        }
        System.out.println("Ortalama:"+ortalama);
    }
}
