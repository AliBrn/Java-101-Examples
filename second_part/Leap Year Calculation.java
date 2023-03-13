package patikajava.ikinci_kisim;

import java.util.Scanner;

public class Leap Year Calculation {
    // Artık Yıl Hesaplayan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir Yıl Giriniz");
        int x= klavye.nextInt();
       if (x%4==0){
           if (x%100==0  && x%400!=0){
               System.out.println("Artık bir yıl değil");
           }else{
               System.out.println("Artık bir yıl");
           }
       }else{
           System.out.println("Artık yıl değil");
       }
    }
}
