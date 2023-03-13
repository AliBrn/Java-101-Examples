package patikajava.metotlar;

import java.util.Scanner;

public class metot21 {
    //Klavyeden girilmiş olan iki boyutlu String dizisi içindeki tek karaktere sahip olanı ekrana yazan metot
    public static void tek_karakter(String a[][]){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if (a[i][j].length()==1){
                    System.out.println(a[i][j]+",");
                }
            }
        }
    }







    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
      String x[][]=new String[3][4];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                x[i][j]= klavye.next();
                }
        } tek_karakter(x);
    }
}




