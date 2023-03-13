package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class odev5 {
    // Fibonacci Serisi
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Kaçli fibonacci serisi ");
        int x= klavye.nextInt();
        int a=0,b=1,total=1;
        for (int i =1; i <=x ; i++) {
            System.out.print(a+",");
            a=b;
            b=total;
            total=a+b;
        }
    }
}
