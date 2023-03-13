package patikajava.metotlar;

public class metot12 {
    // asal sayı bulma metot
   public static boolean asal_bulma(int a){
       if (a<=1){
           System.out.println("sayı 1 den küçük");
       }
       for (int i =2; i <a; i++) {
           if (a%i==0){
               return false;
           }
       }return  true;



   }


    public static void main(String[] args) {

       if (asal_bulma(7)==true){
           System.out.println("sayı asal");
       }
       else
           System.out.println("asal değil");
    }
}
