package patikajava.recursive;

import java.util.Scanner;

public class alıstırma1 {
    // FAKTÖRİYELİ RECURSİVE HESAPLAYAN PROGRAM
    public static int faktoriyel(int a){
        if (a==0){
            return 1;
        }
        else {
            return a*faktoriyel(a-1);
        }

    }
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println(faktoriyel(0));

    }

}
