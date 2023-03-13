package patikajava.recursive;

public class alıstırma7 {
    // girilen Stringi tersden çeviren rekürsif fonksiyonu
    // bir daha bak
    public static String kucuk_a(String x,int i){
        if (i<0){
            return "";
        }else{
             return x.charAt(i)+kucuk_a(x,i-1);

        }

    }
      public static void main(String[] args) {
        String kelime="dondurma";
          System.out.println(kucuk_a(kelime,kelime.length()-1));
    }
}
