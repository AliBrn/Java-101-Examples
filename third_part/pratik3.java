package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class pratik3 {
    // Bir sayı girilip 2 nin kuvvetine kdar olan sayıları ekrana yazan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int x= klavye.nextInt();
        for (int i = 1; i <x;i*=2) {
            System.out.println(i);
        }
    }
}
