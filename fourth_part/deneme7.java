package patikajava.diziler1;

import java.util.Scanner;

public class deneme7 {
    public static void main(String[]args){
    Scanner klavye=new Scanner(System.in);
    // diziyi tersten yazdıran java programı
    int düz[]={1,2,3,4,5,6};

        System.out.println("dizinin düz yazılışı");
        for (int i = 0; i <6 ; i++) {
            System.out.print(düz[i]+",");
        }int gecici;
        for (int i = 0; i < düz.length/2 ; i++) {
            gecici=düz[i];
            düz[i]=düz[düz.length-1-i];
            düz[düz.length-1-i]=gecici;

        }
        System.out.println("dizinin tersten yazılışı");
        for (int i = 0; i <6 ; i++) {
            System.out.print(düz[i]+",");
        }
}
}