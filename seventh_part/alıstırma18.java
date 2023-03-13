package patikajava.recursive;

public class alıstırma18 {
    // iki tane tek boyutlu stringi dizisini birleştirip tek boyutlu string  haline getiren rekürsif metodu
     public static String birlestirme(String x[],String y[],int i){
         if (x.length==i){
             return "";
         }else {
             return x[i]+y[i]+birlestirme(x, y, i+1);
         }

     }


    public static void main(String[] args) {
        String a[]={"ali","ahmet","ali"};;
        String b[]={"huzurlu","yorgun","pasta"};
        System.out.println(birlestirme(a,b,0));
    }
}
