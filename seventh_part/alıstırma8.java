package patikajava.recursive;

public class alıstırma8 {
    // parametre olarak gelen n tam sayısına kadar fibonacci sayısını hesaplayan rekürsif fonksiyonu
     public static void fibonacci(int a,int b,int toplam,int n){
         if (n==0){

         }else{
             System.out.println(a);
             toplam=a+b;
             fibonacci(b,toplam,a+b,n-1);
         }
     }



    public static void main(String[] args) {
       // 1 1 2 3 5 8 13 21 34 55
   fibonacci(1,1,0,8);



    }
}
