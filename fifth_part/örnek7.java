package patikajava.ikiboyutludiziler;

import java.util.Scanner;

public class örnek7 {
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        // sayısal dizinin transpoze işlemi
        int dizi[][]=new int[3][4];
        int transpoze[][]=new int[4][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
               dizi[i][j]= klavye.nextInt();

                }
            }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <3 ; j++) {
                transpoze[i][j]=dizi[j][i];
                System.out.println(transpoze[i][j]);
            }
        }



        }
    }

