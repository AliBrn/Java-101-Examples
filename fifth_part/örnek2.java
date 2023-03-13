package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek2 {
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        //iki boyutlu dizinin en büyük ve enküçüğünü bulup satır ve indisi yazan java programı
        int dizi[][] = new int[3][4];
        for (int i = 0; i <3 ; i++) {
            for (int  j= 0;  j<4 ; j++) {
                dizi[i][j]=klavye.nextInt();
            }
            
        }int max=dizi[0][0];
        int min=dizi[0][0];
        int jmax=0,jmin=0,imin=0,imax=0;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if (max<dizi[i][j]){
                    max=dizi[i][j];
                    jmax=j;
                    imax=i;
                }
                if (min>dizi[i][j]){
                    min=dizi[i][j];
                    jmin=j;
                    imin=i;
                }
            }
        }
        System.out.println("dizinin en büyük  sayısı:"+max+"dizinin  satırı:"+imax+"sütunu"+jmax);
        System.out.println("dizinin en küçük sayısı:"+min+"dizinin  satırı:"+imin+"sütunu"+jmin);
        
    }
}
