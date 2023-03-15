package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Program_to_find_harmonic_numbers {
    //Harmonik serisi 1+1/2+1/3+.... 1/n giden seriyi toplama
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n = klavye.nextInt();
        double total =0;
        for (int i = 1; i <= n; i++) {
            total = total + (1.0 / i);
        }
        System.out.println("Toplamı:"+total);
    }
}
