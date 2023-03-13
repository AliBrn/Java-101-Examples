package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek5 {
    public  static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        //iki boyutlu sayısal diziyi tek boyutlu sayısal dizi haline getirme
        int dizi[][]=new int[3][4];
        int tek[]=new int[12];
        int a=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                dizi[i][j]= klavye.nextInt();
                tek[a]=dizi[i][j];
                a++;
            }
        }
        for (int i = 0; i <12 ; i++) {
            System.out.println(tek[i]);
        }


        }
    }

