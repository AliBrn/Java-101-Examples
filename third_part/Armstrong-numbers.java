package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class Armstrong-numbers {
    // Armstrong sayı olup olmadıgın kontrol eden Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int  number= klavye.nextInt();
        int bsmkdgr=0 ,temp=number,total=0,basValue;
        while (temp!=0){
            temp/=10;
            bsmkdgr++;
        }
        temp=number;
        while (temp!=0){
          basValue=temp%10;
          int carp=1;
            for (int i = 1; i <=bsmkdgr ; i++) {
                carp=carp*basValue;
            }
            total+=carp;
            temp/=10;
        }
        if (total==number){
            System.out.println(total+" Sayısı bir Armstrong sayıdır");
        }else {
            System.out.println(total+" Sayısı bir Armstrong sayı değildir");
        }
    }
}
