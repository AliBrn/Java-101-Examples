package patikajava.recursive;

public class alıstırma11 {
    // kendisine gelen sayıya kadar  pozitif tam sayıya kadar toplayan metot
 public static int toplam(int a){
     if (a<=0){
         return 0;
     }else {
         return a+toplam(a-1);
     }

 }
    public static void main(String[] args) {
        System.out.println(toplam(3));

    }
}
