package patikajava.ikinci_kisim;

import java.util.Scanner;

public class Flight_Ticket_Price_Calculation {
    //Uçak bileti hesaplayan Java programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
     int  age,km,tip;
     double perkm=0.10,total,indirim1,indirim2,indirim3,ucret;
        System.out.println("Gideceğinz mesafeyi yazın");
        km=klavye.nextInt();
        while (km<0){
            System.out.println("Tekrar  mesafeyi giriniz");
            km=klavye.nextInt();
        }
        System.out.println("Yaşınızı giriniz");
        age=klavye.nextInt();
        while (age<0){
            System.out.println("Tekrar yaşınızı giriniz");
            age=klavye.nextInt();
        }
        System.out.println("Tip gidişini seçiniz \n 1-Gidiş \n 2-Gidiş-Dönüş");
        tip=klavye.nextInt();
        while (tip!=1 && tip!=2){
            System.out.println("Geçerli tip numarası girin");
            tip=klavye.nextInt();
        }
        total=perkm*km;
        if (tip==1){
            if (age<12){
                indirim1=total-(total*0.50);
                System.out.println("toplam tutar:"+indirim1);
            }else if(age>12 && age<24){
                indirim1=total-(total*0.10);
                System.out.println("toplam tutar:"+indirim1);
            } else if (age>65) {
                indirim1=total-(total*0.30);
                System.out.println("toplam tutar:"+indirim1);
            }else{
                indirim1=total;
                System.out.println("toplam tutar:"+indirim1);
            }


        }else{
            if (age<12){
                indirim2=total-(total*0.50);
                indirim3=indirim2-(indirim2*0.20);
                ucret=indirim3*2;
                System.out.println("toplam tutar:"+ucret);
            }else if(age>12 && age<24){
                indirim2=total-(total*0.10);
                indirim3=indirim2-(indirim2*0.20);
                ucret=indirim3*2;
                System.out.println("toplam tutar:"+ucret);
            } else if (age>65) {
                indirim2=total-(total*0.10);
                indirim3=indirim2-(indirim2*0.20);
                ucret=indirim3*2;
                System.out.println("toplam tutar:"+ucret);
            }else{
                 indirim3=total-(total*0.20);
                 ucret=indirim3*2;
                System.out.println("toplam tutar:"+ucret);
            }


        }
    }
}
