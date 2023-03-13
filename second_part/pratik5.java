package patikajava.ikinci_kisim;

import java.util.Scanner;

public class pratik5 {
    // Girilen 3 sayıyı küçükten büyüğe sıralama
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("1.Sayı giriniz:");
        int a= klavye.nextInt();
        System.out.print("2.Sayı giriniz:");
        int b= klavye.nextInt();
        System.out.print("3.Sayı giriniz:");
        int c= klavye.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("a<b<c");
            }else{
                System.out.println("a<c<b");
            }
        } else if (b<a && b<c) {
            if (a<c){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }

        }else {
            if (a<b){
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }

    }
}
