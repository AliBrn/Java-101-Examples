package patikajava.diziler1;

import java.util.Scanner;

public class deneme11 {
    // klavyeden girilen stringleri  sözlükte ilk yer alanı ilk yazan java programı
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String a[]=new String[5];
        for (int i = 0; i < 5; i++) {
            a[i]= klavye.next();
        }String str=a[0];
        for (int i = 0; i < 5; i++) {
            if (str.compareTo(a[i])>0){
                str=a[i];
            }

        }
        System.out.println(str);

    }
}


