package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class extra6 {
    // b bi bil bilg bilgi bilgis bilgisi bilgisiy bilgisiya bilgisiyar diye tersten yazan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Kelime girin");
        String a= klavye.next();
        for (int i = 0; i <a.length() ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(a.charAt(a.length()-1-j));
            }
            System.out.println("");
        }
    }
}
