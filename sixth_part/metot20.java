package patikajava.metotlar;

public class metot20 {
    // n dizi li fibonacci dizisini geri  döndüren metot 1 1 2 3 5 8 13 21 34 55 89
    // bir daha bak!
    public static void fibonacci(int a){
        int x=1,b=1,toplam=2;
        for (int i = 0; i <a ; i++) {
            System.out.println(x);
            x=b;
            b=toplam;
            toplam=x+b;
        }
    }
    public static void main(String[] args) {

        fibonacci(8);
    }
}
