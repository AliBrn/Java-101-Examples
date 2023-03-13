package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek4 {
    public  static void main(String[]args) {
        Scanner klavye = new Scanner(System.in);
        // iki boyutlu dizinin sütunlarını toplayan java program kodu
        int toplam = 0;
        int a = 0;
        int dizi[][] = new int[3][4];
        int top[] = new int[4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                dizi[i][j] = klavye.nextInt();

            }


        }
        for (int i = 0; i<4 ; i++) {
            for (int j = 0; j <3 ; j++) {
               toplam+=dizi[j][i];

            }top[a]=toplam;
            toplam=0;
            a++;

            }
        for (int i = 0; i <4 ; i++) {
            System.out.println(top[i]);
        }
        }

}
