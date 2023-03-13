package patikajava.metotlar;

import java.util.Scanner;

public class metot23 {
    // kendisine parametre olarak gelen iki sayısal dizziyi karşılaştırıp yerleri aynı olmak şartıylla büyük olan değeri farklı
    // bir diziye alıp geri döndüren metot
    public static int[] merae(int a[],int b[]){
        int c[]=new int[a.length];
        int k=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>=b[i]){
              c[k]=a[i];
              k++;
            }if (b[i]>a[i]){
                c[k]=b[i];
                k++;
            }
        }

        return c;
    }
    public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
     int a[]={5,41,2,412,43,32};
     int b[]={5,3,6,71,67,31};

        int c[]=merae(a,b);
        for (int i = 0; i < 6; i++) {
            System.out.println(c[i]);
        }
        }
    }

