package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek1 {
    public static void main(String[]args) {
        Scanner klavye = new Scanner(System.in);
        //ikki boyutlu dizinin ortalamasını hesaplayıp bide bu dizinin ortalamasından küçük olanı bulup  satır,sütunu bulan java programı
        int toplam=0;
        double ortalama;
         int dizi[][] = new int[3][4];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                dizi[i][j]= klavye.nextInt();
                toplam=toplam+dizi[i][j];


            }
        }ortalama=toplam/ 12.0;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[0].length ; j++) {
                if (ortalama>dizi[i][j]){
                    System.out.println("küçük olan ortalamadan:"+dizi[i][j]+" satır sayısı:"+i+" sütun sayısı:"+j);
                }
            }
        }


    }
}
