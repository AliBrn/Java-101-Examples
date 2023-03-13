package patikajava.recursive;

public class alıstırma4 {
    // recursive metodla girilen sayının pozitif olanların sayısın bulan metot
 public static int pozitif(int a[],int i){
     if (a.length==i){
         return 0;
     } else if (a[i]>0) {
         return 1+pozitif(a,i+1);

     }else {
         return  pozitif(a,i+1);


     }

 }


    public static void main(String[] args) {
     int a[]={5,4,-7,8,-9,0,10,-1};
        System.out.println(pozitif(a,0));

    }
}
