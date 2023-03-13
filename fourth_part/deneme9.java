package patikajava.diziler1;

import java.util.Scanner;

public class deneme9 {
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        // girilen stringi tersten yazan program hemde kelimeyi tersten yazma programı
        String dizi[]=new String[5];
        String ters[]=new String [5];
        int a=0;
        System.out.println("dizinin  düz hali");
        for (int i = 0; i <5 ; i++) {
            dizi[i]= klavye.next();
            ters[a]=dizi[i];
            a++;

        }
        for (int i = ters.length-1; i>=0 ; i--) {
            for (int j = 0; j <ters[i].length() ; j++) {
                System.out.println(ters[i].charAt(ters[i].length()-1-j));
            }

        }





    }
}
