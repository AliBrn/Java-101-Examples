package patikajava.metotlar;

import java.util.Scanner;

public class metot10 {
    // iki  sayısal dizideki ortak elemanı giren biri klavyeden diğeri tanımlanmış olup aynı olanları ekrana yazan program
    public static void ortak_bulma(int a[],int b[]){
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==b[i]){
                System.out.println(a[i]+",");
            }
        }
    }





    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        int a[]={5,7,6,9,12};
        int b[]=new int[5];
        for (int i = 0; i < b.length ; i++) {
            b[i]= klavye.nextInt();
        }
        ortak_bulma(a,b);
    }
}
