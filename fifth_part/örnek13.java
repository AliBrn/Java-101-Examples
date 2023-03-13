package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek13 {
    public static void main(String[] args) {
        // rastgele sayılar girilip 10 tane asal sayı olunca diziye atayıp en büyüğünü   bulan  asal sayı programı.
        Scanner klavye = new Scanner(System.in);
        int k[] = new int[10];
        int y = 0;
        int sayac = 0;
        for (;;) {
            int x = klavye.nextInt();
            sayac = 0;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0 && x!=1) {
                k[y] = x;
                y++;
            }
            if (y == 10) {
                break;
            }
        }
        int max = k[0];
        for (int i = 0; i < 10; i++) {
            if (max < k[i])
                max = k[i];
        }
        System.out.println("En buyuk sayi =" + max);



    }
}