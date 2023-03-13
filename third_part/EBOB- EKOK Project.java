package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class EBOB- EKOK Project {
    //Ebob Ekok bulan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Birinci sayıyı girin");
        int s1= klavye.nextInt();
        System.out.println("İkinci sayıyı girin");
        int s2= klavye.nextInt();
        int ebob=1,ekok;
        int min= (s1<s2) ? s1:s2;
        int i=min;
        while (i>=1){
            if ((s1%i==0 )&&(s2%i==0)){
                ebob=i;
                break;
            }

        }
        ekok=(s1*s2)/ebob;
        System.out.println("Ekokları:"+ekok);
        System.out.println("Ebobları:"+ebob);
    }
}
