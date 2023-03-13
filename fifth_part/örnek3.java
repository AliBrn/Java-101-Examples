package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek3 {
    public  static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        // iki boyutlu sayısal dizinin satırlarını toplayan java programı
        int toplam=0;
        int a=0;
        int dizi[][]=new int[3][4];
        int top[]=new int[3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                dizi[i][j]= klavye.nextInt();
                toplam+=dizi[i][j];

            }top[a]=toplam;
            toplam=0;
            a++;
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(top[i]);
        }
    }
}
