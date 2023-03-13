package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        //klavyeden girilen dizinin asal olan sayıları yerlerini ve kendisi ekrana yazan
        int dizi[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                dizi[i][j] = k.nextInt();
            }
        }
        int sayac = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sayac = 0;
                if (dizi[i][j] >= 2) {
                    for (int l = 2; l < dizi[i][j]; l++) {
                        if (dizi[i][j] % l == 0) {
                            sayac++;

                        }
                    }
                        if (sayac==0){
                            System.out.println(dizi[i][j]);
                        }

                }
            }
        }
    }
}
