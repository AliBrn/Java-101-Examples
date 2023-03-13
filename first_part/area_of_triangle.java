package patikajava.birinci_kisim;

import java.util.Scanner;

public class area_of_triangle {
    // 3 kenarı girilen üçgenin alanını hesaplayan program
    public static void main(String[] args) {
         double alan;
        Scanner klavye=new Scanner(System.in);
        System.out.println("1.Kenar giriniz");
        int a= klavye.nextInt();
        System.out.println("2.Kenar Giriniz");
        int b= klavye.nextInt();
        System.out.println("3.Kenar Giriniz");
        int c= klavye.nextInt();
        double u=(a+b+c)/2;
         alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan:"+alan);


    }
}
