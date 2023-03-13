package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek11 {
    // klavyeden girilen iki boyutlu string dizinin elaman sayısı uzunluğu 3 ve 4 olanı yeni bir diziye aktaran dizi
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String a[][]=new String[3][3];
        String x[]=new String[9];
        int k=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                a[i][j]= klavye.next();
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j].length()==3 || a[i][j].length()==4){
                   x[k]=a[i][j];
                   k++;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }


    }
}
