package patikajava.metotlar;

import java.util.Scanner;

public class metot6 {
    // klavyeden girilen stringin küçük a sayısını bulma
    public static void  a_sayısıbulma(String x){
        int indis=0;
        for (int i = 0; i <x.length() ; i++) {
            if (x.charAt(i)=='a')
                indis++;
        }
        System.out.println(indis);

    }
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        String x= klavye.next();
        a_sayısıbulma(x);
    }

}
