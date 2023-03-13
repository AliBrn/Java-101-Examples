package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Combination {
    //Kombinasyon hesabı yapan Java programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("n değerini giriniz");
        int n= klavye.nextInt();
        System.out.print("r değerini giriniz:");
        int r= klavye.nextInt();
        int carp=1,f=1,fark,son=1;
        // n  faktöriyeli
        for (int i =1 ;i <=n ; i++) {
            carp*=i;
        }
        // r faktöriyeli
        for (int i =1; i <=r ; i++) {
            f=f*i;
        }
        // fark n-r faktöriyeli
        fark=n-r;
        for (int i = 1; i <= fark; i++) {
            son*=i;
        }
        System.out.println("Kombinasyon sonucu:"+(carp/(f*son)));

    }
}
