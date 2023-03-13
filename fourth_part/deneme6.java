package patikajava.diziler1;

import java.util.Scanner;

public class deneme6 {
    public  static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        // klavyeden girilen not ve isimlerden en yüksek not alan kişi ve ismi yazan
        String isim[]=new String[5];
        int  not[]=new int[5];
        for (int i = 0; i <5 ; i++) {
            isim[i]= klavye.next();
            not[i]= klavye.nextInt();
        } int max=not[0];
         String kelime=isim[0];
        for (int i = 0; i <5 ; i++) {
            if (max<not[i]) {
                max = not[i];
                kelime = isim[i];
            }
        }
        System.out.println("en yüksek not alan kişi: "+kelime+"en yüksek not: "+max);

    }
 }
