package patikajava.metotlar;

public class metot15 {
 // parametre olarak gelen sayınını faktöriyelini hesaplayıp geri döndüren metot
    public  static int faktoriyel(int a){
        if (a<0) System.exit(1);
          int f=1;
        for (int i = 2; i <=a ; i++) {
            f=f*i;
        }return f;



    }
    public static void main(String[] args) {
         int d=faktoriyel(5);
        System.out.println(d);
    }
}
