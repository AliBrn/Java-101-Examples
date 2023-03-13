package patikajava.metotlar;

import java.util.Scanner;

public class metot11 {
    //  parametre olarak gelen pozitif tam sayısı  0 a kadar toplayıp döndüren java programı.
    public  static int karakter_dizisi(int a){
        int toplam=0;
        for (int i = 1; i <=a ; i++) {
            toplam+=i;
        }return toplam;
    }














    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println(karakter_dizisi(17));



    }
}
