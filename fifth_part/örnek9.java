package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek9 {
    public static void main(String[]args) {
        Scanner klavye = new Scanner(System.in);
        // 2 boyutlu stringin en uzun karaktere sahip olan ,stringi karakter sayısını ,kaçıncı satır ve sütunda oldugun  yazan program
      String dizi[][]=new String[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3 ; j++) {
                dizi[i][j]= klavye.next();
            }
        }int max=dizi[0][0].length();
        int imax=0,jmax=0;
        String str=dizi[0][0];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (max<dizi[i][j].length()){
                    max=dizi[i][j].length();
                    imax=i;
                    jmax=j;
                    str=dizi[i][j];
                }
            }
        }
        System.out.println("en uzun karakter sayısı:"+max+"karakterin satırı:"+imax+"karakterin sütunu:"+jmax+"karakter:"+str);

    }
}
