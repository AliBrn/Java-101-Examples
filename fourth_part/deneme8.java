package patikajava.diziler1;

import java.util.Scanner;

public class deneme8 {
    public  static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        // bir dizinin sıralı olması küçükten büyüğe versiyonu
        int dizi[]={5,7,12,11,1,8,9,3};
        int sıralı[]=new int[8];
        int gecici;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi.length-1 ; j++) {
                if (dizi[j]>dizi[j+1]){
                    gecici=dizi[j+1];
                    dizi[j+1]=dizi[j];
                    dizi[j]=gecici;


                }

            }

        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
