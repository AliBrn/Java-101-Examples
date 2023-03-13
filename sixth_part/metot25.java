package patikajava.metotlar;

import java.util.Scanner;

public class metot25 {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
         int sayi=0;
         int sayac=0;
         int toplam=0;
         while (true){
             for (;;){
                 sayi=klavye.nextInt();
                 if (sayi==0){
                     System.out.println(toplam);
                   sayac++;
                 toplam=0;
                 break;}
                 else{
                     toplam+=sayi;
                 }
             }
             if (sayac==10){
                 break;
             }
         }
    }
}
