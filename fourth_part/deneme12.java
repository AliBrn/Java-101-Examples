package patikajava.diziler1;

import java.util.Scanner;
    // klavyedenn girilen 5 Stringi sözlüğe göre sıralama
public class deneme12 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String x[]=new String[5];
        String temp;
        for (int i = 0; i <5 ; i++) {
            x[i]= klavye.next();
        }
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i].compareTo(x[j])<0){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]);
        }




    }
}
