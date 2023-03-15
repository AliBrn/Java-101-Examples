package patikajava.ikinci_kisim;

import java.util.Scanner;

public class Suggesting_Events_Based_on_Air_Temperature {
    //Sıcaklığa göre gidebilceği etkinlikleri  önerme
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Sıcaklık giriniz:");
        int heat= klavye.nextInt();
        if (heat<5){
            System.out.println("Kayak yapmaya gidebilirsin");
        } else if (heat>5 && heat<25) {
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsin");
            }if (heat>=10){
                System.out.println("Piknik yapmaya gidebilirsin");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
