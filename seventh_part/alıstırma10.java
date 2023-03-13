package patikajava.recursive;

public class alıstırma10 {
    // dizi sıralı mı kontrol eden rekürsif metodu
    public static boolean kontrol_etme(int dizi[],int i){
     if (dizi.length -1==i){
         return  true;

     } else if (dizi[i]>dizi[i+1]) {
         return  false;
     }else{
         return kontrol_etme(dizi,++i);

        }


    }


    public static void main(String[] args) {
        int dizi[]={1,2,6,6,7,3,8,9};
        boolean sayı=kontrol_etme(dizi,0);
        if (sayı){
            System.out.println("dizi sıralı");
        }
        else {
            System.out.println("dizi  sıralı değil");
        }

    }
}
