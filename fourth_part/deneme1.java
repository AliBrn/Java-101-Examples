package patikajava.diziler1;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        // klavyeden girilen dizinin ortalamasını hesaplayan
        int toplam=0;
        int dizi[]=new int[10];
        for (int i = 0; i <10 ; i++) {
            dizi[i]=klavye.nextInt();
            toplam=toplam+dizi[i];

        }
        System.out.println("ortalama:"+ (double)toplam/dizi.length);
    }
}

