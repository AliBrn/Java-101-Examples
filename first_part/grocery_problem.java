package patikajava.birinci_kisim;

import java.util.Scanner;

public class  grocery_problem {
    // Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        double armut=2.14, elma=3.67, muz=0.95,patlican=5.00,domates=1.11;
        System.out.println("Kaç kilogram armut ?");
        double x= klavye.nextDouble();
        System.out.println("Kaç Kilogram elma ?");
        double y= klavye.nextDouble();
        System.out.println("Kaç Kilogram muz ?");
        double a= klavye.nextDouble();
        System.out.println("Kaç Kilogram domates ?");
        double  d= klavye.nextDouble();
        System.out.println("Kaç Kilogram patlıcan ?");
        double p= klavye.nextDouble();
        double tutar=(x*armut)+(elma*y)+(muz*a)+(patlican*p)+(domates*d);
        System.out.print("Toplam Tutar:"+tutar);
    }
}
