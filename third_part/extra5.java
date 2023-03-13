package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class extra5 {
    //Klavyeden girilen 5 Stringin orta harfi  'm' olanları  yazan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String klm;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Kelime girin");
            klm = klavye.next();
            if (klm.charAt(klm.length() / 2) == 'm') {
                System.out.println(klm);
            }

        }
    }
}
