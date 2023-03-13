package patikajava.metotlar;

public class metot7 {
    //  parametre olarak gelen tek boyutlu sayısal dizinin  ortalamasını bulma
    public static void ortalama(int a[]){
        int top=0;
        for (int i = 0; i <a.length ; i++) {
            top+=a[i];
        }double ortalama=(double)top/a.length;
         System.out.println(ortalama);
    }



    public static void main(String[] args) {
   int A[]={6,7,12,11,5,9,8,3,9};
       ortalama(A);
    }
}
