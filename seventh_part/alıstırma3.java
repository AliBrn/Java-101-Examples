package patikajava.recursive;

import java.util.Scanner;

public class alıstırma3 {
    // dizideki en büyük elemanı rekürsifle yapan metot
    // hem voidli hemde return
    public static void  dizi(int a[],int i,int max){
        if (a.length==i){
            System.out.println(max);
        } else if (a[i]>max) {
            dizi(a,i+1,a[i]);
        }
        else {
            dizi(a,i+1,max);

        }

    }public static  int buyuk_bulma(int a[],int i,int büyük){
        if (a.length==i){
            return büyük;
        }else if (a[i]>büyük){
            return buyuk_bulma(a,i+1,a[i]);

        }else {
            return  buyuk_bulma(a,i+1,büyük);
        }



    }
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int sayi[]={7,6,12,1,5,4,1};
        int max=sayi[0];
        dizi(sayi,1,max);
        int dizi[]={133,3,4,9,21,0,11};
        int enb=dizi[0];
        System.out.println(buyuk_bulma(dizi,1,enb));

    }
}
