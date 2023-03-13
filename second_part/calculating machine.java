package patikajava.ikinci_kisim;

import java.util.Scanner;

public class calculating machine {
    //Switch-Case Hesap makinesi yapımı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Birinci Sayıyı Girin");
        int x= klavye.nextInt();
        System.out.println("İkinci Sayıyı Girin");
        int y= klavye.nextInt();
        System.out.println("Yapacağınız işlemi seçin:");
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        int select= klavye.nextInt();
        switch (select){
            case 1:
                System.out.print("Toplama sonucu:"+(x+y));
            break;
            case 2:
                System.out.println("Çıkarma sonucu:"+(x-y));
            break;
            case 3:
                System.out.println("Çarpma sonucu:"+ (x*y));
                break;
            case 4:
                System.out.println("Bölme sonucu:"+ (x/y));
                break;
            default:
                System.out.println("Yanlış Tuşladınız");

        }
    }

}
