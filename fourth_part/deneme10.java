package patikajava.diziler1;

import java.util.Random;
import java.util.Scanner;

public class deneme10 {
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        // rastgele sayılar giriliyor diziye eleman olarak
        int a[]=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=(int)(1000*Math.random());}
        for (int i = 0; i <10 ; i++) {
            System.out.println(a[i]);
        }


        }
    }
