package patikajava.diziler1;

import java.util.Scanner;

public class deneme5 {
    public static void main(String[]args){
        Scanner klavye=new Scanner(System.in);
        // klavyeden girilen 10 tane kelimeden en uzun kelimeyi  yazıp indisi ve karakter sayısını yazan program
        String str="";
        int indis=0;
        String dizi[]=new String[10];
        for (int i = 0; i <10 ; i++) {
            dizi[i]= klavye.next();
        }int max=dizi[0].length();

        for (int i = 0; i <10 ; i++) {
            if (max<dizi[i].length()){
                max=dizi[i].length();
                indis=i;
                str=dizi[i];
        }



        }
        System.out.println("en uzun karakter:"+str+" karakter sayısı:"+max+"indis numarası:"+indis);

    }
}

