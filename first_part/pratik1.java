package patikajava.birinci_kisim;

import java.util.Scanner;

public class pratik1 {
    // Girilen 3 dersin ortalamasını hesaplayan java programı
    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        System.out.println("Matematik Notunu giriniz");
        int x= klavye.nextInt();
        System.out.println("Türkçe Notunu giriniz");
        int y= klavye.nextInt();
        System.out.println("Kimya Notunu giriniz");
        int a= klavye.nextInt();
        int toplam=x+y+a;
        double ortalama=toplam/3.0;
        System.out.println("Ortalama:"+ortalama);
         String durum=(ortalama>60) ? "Geçti":"Kaldı";
        System.out.println(durum);
    }
}
