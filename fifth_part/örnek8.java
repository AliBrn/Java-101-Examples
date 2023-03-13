package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek8 {
    public static void main(String[]args) {
        Scanner klavye = new Scanner(System.in);
        // klavyeden girilen stringi  satırları yan yana  yazan
        String dizi[][] = new String[2][3];
        String b[] = new String[2];
        String str="";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j] = klavye.next();
               str+=dizi[i][j];

            }b[i]=str;
            str="";
        }
        for (int i = 0; i <2 ; i++) {
            System.out.println(b[i]);
        }
    }}