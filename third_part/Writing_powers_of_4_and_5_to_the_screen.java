package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Writing_powers_of_4_and_5_to_the_screen {
    //Girilen sayının 4'e ve 5'e bölünenleri ekrana yazan Java programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int x= klavye.nextInt();
        for (int i =1,j=1; i <=x; i=i*4,j=j*5) {
            System.out.print(i+",");
            System.out.print("");
            System.out.println(j+"");
        }


    }
}
