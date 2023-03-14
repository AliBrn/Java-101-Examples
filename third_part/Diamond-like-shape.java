package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Diamond-like-shape {
    //Elmas şeklinde yıldız yapan Java Programı
    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
         System.out.print("Bir sayı girin:");
       int n= klavye.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int k =0; k <(2*i+1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n; i >=0 ; i--) {
            for (int j =n-i; j>0 ; j--) {
                System.out.print(" ");
            }
            for (int k =(2*i+1); k>0 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
