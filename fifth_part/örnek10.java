package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek10 {
    // iki boyutlu string dizisinin ortadaki harfi a olanı ekrana yazan java programı
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        String a[][]=new String[3][4];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                a[i][j]= klavye.next();
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j].charAt(a[i][j].length()/2)=='a'){
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
