package patikajava.diziler1;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        // klavyeden girilen dizinin ortalamasını bulup bundan küçük olanları ekrana yazan indisleriyle
        int dizi[]=new int[10];
        double ortalama,toplam=0;
        for (int i = 0; i <10 ; i++) {
            dizi[i]= klavye.nextInt();
            toplam=toplam+dizi[i];



        }ortalama=toplam/dizi.length;
        for (int i = 0; i <10 ; i++) {
            if (ortalama>dizi[i])
                System.out.println("ortalamadan küçük: "+dizi[i]+"indiside: "+i);
        }
    }
}