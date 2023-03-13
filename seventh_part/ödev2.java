package patikajava.recursive;
import java.util.Random;

public class ödev2 {


    static Random rastgele = new Random();
    static String  sifreler[]  = new String[200];

    public static void sifre() {
        int i = 0;
        String x = "";
        while (i < sifreler.length) {
            for (int a = 0; a < 8; a++) {
                x = x+ "" + rastgele.nextInt(8);
            }
           sifreler[i] = x;
              x = "";// yeniden sıfırlansın diye
              i++;
        }
    }

    public static boolean tercih(String[] x) {
        boolean secim = false;
        for (int i = 0; i < x.length; i++) {
            for (int a = 0; a < x.length; a++) {
                if (x[i] == x[a]) secim = true;
                else secim = false;
            }
        }
        return secim;
    }

    public static void main(String[] args) {
        sifre();
        if(tercih(sifreler)) System.out.println("Sifrelerin hepsi farkı");
        else System.out.println("Tekrar eden sifre var");
        for (int i = 1; i < 200; i++) {
            System.out.println(sifreler[i]);
        }

    }
}
