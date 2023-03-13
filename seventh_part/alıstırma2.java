package patikajava.recursive;

import java.util.Scanner;

public class alıstırma2 {
    //  basamak sayısını bulan metot
    public static int basamak(int a){
        if (a==0){
            return 0;

        }else {
              return 1+basamak(a/10);

        }

    }

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println(basamak(1213123321));



    }
}
