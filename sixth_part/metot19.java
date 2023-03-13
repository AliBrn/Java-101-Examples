package patikajava.metotlar;

import java.util.Scanner;

public class metot19 {
    // kendisine parametre olarak gelen sayının kaç basamaklı oldugun bulan  metot
    // bidaha bak çalışmıyor hata vwrioyr
   public static void basamak(int a){
       int sayac=0;
       while (a!=0){
         a=a/10;
         sayac++;
       }
       System.out.println("basamak sayısı:"+sayac);


   }

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        basamak(1232131);




    }
}
