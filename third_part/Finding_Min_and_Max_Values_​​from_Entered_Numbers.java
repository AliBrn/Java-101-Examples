package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Finding_Min_and_Max_Values_from_Entered_Numbers {
       //Kullanıcı girdiği sayılardan en küçüğünü ve en büyüğünü bulan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int x= klavye.nextInt();
        int max=0, min=0,a;
        for (int i =1; i <=x ; i++) {
            System.out.print(i +" .Sayıyı giriniz:");
             a= klavye.nextInt();
            if (max<a){
                max=a;
            }if (min>a){
                min=a;
            }
        }
        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);
    }
}
