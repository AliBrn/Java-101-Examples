package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Even_and_4_multiples_numbers_adder_program {
    // Girilen sayılardan 4 bölünenleri toplayan tek sayı girdiğinde  Java Programını durduran program.
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int toplam=0,x;
        do {
            System.out.print("Bir sayı giriniz:");
            x= klavye.nextInt();
            if (x%4==0){
                toplam+=x;
            }
        }while (x%2==0);
        System.out.println("Program bitti girilen  sayılardan 4 e bölünenin toplamı:"+toplam);

    }
}
