package patikajava.diziler1;

import java.util.Scanner;

public class deneme4 {
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        //KLAVYEDEN GİRİLEN String dizisinin     karakterlerindeki son harfi a olanları ekrana yazan program
        String dizi[]=new String [5];
        for (int i = 0; i < 5; i++) {
            dizi[i]= klavye.next();
        }
        for (int i = 0; i <5 ; i++) {
            if (dizi[i].charAt(dizi[i].length()-1)=='a')
            System.out.println(dizi[i]);
        }

    }
}
