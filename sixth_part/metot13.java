package patikajava.metotlar;

public class metot13 {
    // metot içinde  metot kullanımı metotlarda asal sayısını bulma
    public static boolean asal(int a) {

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {

                return false;
            }
        }
        return true;
    }

    public static void asal_bulma(int x[]) {
        for (int i = 0; i < x.length; i++) {
            if (asal(x[i]) == true) {
                System.out.println(x[i] + ",");
            }

        }
      }

    public static void main(String[] args) {
        int x[] ={15,12,11,7,9,8,3,6,4};
        asal_bulma(x);
    }
}








