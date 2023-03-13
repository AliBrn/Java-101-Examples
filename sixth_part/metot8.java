package patikajava.metotlar;

import java.util.Scanner;

public class metot8 {
    // klavyeden girilen STRİNGİ parametre olarak algılayıp bu stringi  karakter dizisine dönüştüren metot
    public static void karakter(String a){
        char c[]=new char[a.length()];
        for (int i = 0; i < c.length; i++) {
            c[i]=a.charAt(i);
            System.out.print(c[i]+",");
        }
    }


    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String kelime= klavye.next();
        karakter(kelime);
    }
}
