package patikajava.metotlar;

public class metot5 {
    // parametresi girilen fonksiyonun üs alma programını hesaplayan
    public static void us_alma(int a,int b){
        int sonuc=1;
        for (int i = 0; i <b ; i++) {
            sonuc=sonuc*a;
        }
        System.out.println(sonuc);
    }


    public static void main(String[]args){
        us_alma(2,3);
        us_alma(9,3);
    }
}
