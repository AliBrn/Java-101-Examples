package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class extra4 {
    //Klavyeden girilen Stringi tersten çeviren Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
      /*  System.out.println("Kelime girin");
        String str= klavye.next();
        for (int i =str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }*/
        // İkinci yol
       /* System.out.println("Kelime girin");
        String word=klavye.nextLine();
        String klm=" ";
        for (int i = 0; i <word.length() ; i++) {
              klm=word.charAt(i)+klm;
        }
        System.out.println("Kelimenin tersten yazılışı: "+ klm);*/
        //  Üçüncü yol
         System.out.println("Kelime girin");
         String x=klavye.nextLine();
         for (int i = 0; i <x.length() ; i++) {
            System.out.print(x.charAt(x.length()-1-i));
        }
    }
}
