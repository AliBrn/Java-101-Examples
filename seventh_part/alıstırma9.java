package patikajava.recursive;

public class alıstırma9 {
    // kendisine parametre olarak gelen stringdeki küçük karakter hesaplayan rekürsif fonksiyonu
  public static int kucuk_sayma(String x,int i){
      if (x.length()==i){
          return  0;
      } else if (x.charAt(i)>='a'&& x.charAt(i)<='z'){
          return 1+kucuk_sayma(x,i+1);
      }else {
          return kucuk_sayma(x,i+1);
      }


          

  }


    public static void main(String[] args) {
        System.out.println(kucuk_sayma("sadaADBASAaasBAasaBbK",0));

    }
}
