package patikajava.metotlar;

public class metot17 {
    // parametre olarak gelen iki stringin dizisi içindeki ilk karakteri a olanları birleştirip tek bir string haline  getirip geri döndüren metot
    public static String bul_birlestirme(String a[],String b[]){
        String str="";
        for (int i = 0; i <a.length ; i++) {
            if (a[i].charAt(0)=='A')
                str=str+a[i];
            if (b[i].charAt(0)=='A')
                str=str+b[i];

        }return  str;


    }
    public static void main(String[] args) {
        String x[]={"ali","Ayşe","Ahmet"};
        String y[]={"Mustafa","Anıl","kAMİL"};
        System.out.println(bul_birlestirme(x,y));
    }
}
