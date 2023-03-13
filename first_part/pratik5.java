package patikajava.birinci_kisim;

import java.util.Scanner;

public class pratik5 {
    public static void main(String[] args) {
        // Dairenin alanını hesaplayan program
        Scanner klavye=new Scanner(System.in);
        double pi=3.14;
        System.out.print("Dairenin merkez ölçüsünün derecesi:");
        int x= klavye.nextInt();
        System.out.print("Yarıçapı giriniz:");
        int r= klavye.nextInt();
        double alan=(pi*r*r*x/360);
        System.out.println("Dairenin Alanı:"+alan);
    }
}
