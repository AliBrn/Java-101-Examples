package patikajava.recursive;

public class alıstırma6 {
    // aynı  eleman sayısına sahip  iki sayısal dizideki ortak olan elemanların aynı indisteki elemanların
    // toplamını bulan recursive metodu
    public static int t;
   public static int ortak_bulma(int a[],int b[],int i){
       if (a.length==i){
           return 0;
       } else if (a[i]==b[i]) {
           return
           a[i]+ortak_bulma(a,b,i+1);
       }else {
           return ortak_bulma(a,b,i+1);
       }


   }

    public static void main(String[] args) {
        int a[]={5,9,7,12,3,6};
        int b[]={5,11,4,12,1,6};
        System.out.println(ortak_bulma(a,b,0));


    }
}
