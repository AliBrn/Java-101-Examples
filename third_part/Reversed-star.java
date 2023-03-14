package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Reversed-star {
    //Yıldızları tersten yapan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
      int  satir= klavye.nextInt();
        for (int i =satir; i>=1 ; i--) {
            for (int j =satir-i; j>=1 ; j--) {
                System.out.print(" ");
            }
            for (int k =(2*i-1); k>=1 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
