package patikajava.recursive;

public class alıstırma17 {
    // girilen tek boyutlu string dizisinin  birleştiren  rekürsif metodu
 public static  String birlestirme(String a[],int i){
     if (a.length==i){
         return "";
     }else {
         return a[i]+birlestirme(a,i+1);
     }

 }

    public static void main(String[] args) {
     String x[]={"güzel","tatlı","yemek","ayı"};
        System.out.println(birlestirme(x,0));

    }
}