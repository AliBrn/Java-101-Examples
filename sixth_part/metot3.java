package patikajava.metotlar;

public class metot3 {
    // retunlu metotda  void yerine döndürceğin veri türü yazılır. returnlar fonksiyon oldugu için ya tanımlama yapcan yada ,sout içinde yazcan
    // parametrelileri olan fonksiyonun  geri döndüren metot.
    public  static int  toplama(int a,int b){
        int sonuc=a+b;

      return sonuc;
    }

    public static  void main(String[]args){

        System.out.println(toplama(6,10));
    }
}
