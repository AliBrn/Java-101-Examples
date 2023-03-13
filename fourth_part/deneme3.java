package patikajava.diziler1;

import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        // klavyeden girilen stringin  baş harfi t veya T ile başlayanları  ekrana yazan program
        String isim[]=new String[5];
        for (int i = 0; i <5 ; i++) {
            isim[i]=klavye.next();

        }
        for (int i = 0; i <5 ; i++) {
            if (isim[i].charAt(0)=='t'|| isim[i].charAt(0)=='T')
                System.out.println(isim[i]);
        }
    }
}