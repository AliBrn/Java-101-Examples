package patikajava.metotlar;

public class metot4 {
    // eğer tanımalamazsan  kod işler ama gözükmez o yüzden tanımlıyoruz
    // parametresiz fonksiyonu geri döndüren java metodu
    public static int toplama(){
        int a=5,b=1;
        int sonuc=a+b;
        return a+b;
    }


    public static void main(String[]args){
       int d= toplama();
        System.out.println(d);
    }
}
