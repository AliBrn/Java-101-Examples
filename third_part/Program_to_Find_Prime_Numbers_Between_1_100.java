package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Program_to_Find_Prime_Numbers_Between_1_100 {
    // 1-100 arasındaki asal sayıları bulan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Asal sayılar:");
       int sayac=0;
        for (int i =2; i <=100 ; i++) {
            sayac=0;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    sayac++;
                    break;
                }
            }if (sayac==0){
                System.out.print(i+",");
            }

        }
    }
}
