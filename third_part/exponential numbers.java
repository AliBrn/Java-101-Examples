package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class exponential numbers {
    //Üs alan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Taban olcak sayıyı girin");
        int x= klavye.nextInt();
        System.out.println("Üs olacak sayıyı girin");
        int y= klavye.nextInt();
        int carp=1;
        for (int i = 1; i <=y ; i++) {
            carp=carp*x;
        }
        System.out.println("Üs sonucu:"+carp);


    }
}
