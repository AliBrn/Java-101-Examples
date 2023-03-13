package patikajava.recursive;

public class alıstırma14 {

    // iki sayının ebobunu rekürsif  metoduyla hesaplayan program
    public static String ebek_bulma(int say1,int say2,int i, int ebob,int ekok){
        if (ekok!=0){
            return ebob+" "+ekok;
        } else if (say1%i==0 && say2%i==0) {
            return  ebek_bulma(say1,say2,i-1,i,ekok);
        } else if (ebob!=0) {
            return  ebek_bulma(say1,say2,i-1,ebob,(say1*say2/ebob));
        } else {

            return ebek_bulma(say1,say2,i-1,ebob,ekok);
        }


    }
    
    public static void main(String[] args) {
        System.out.println(ebek_bulma(20,15,20,0,0));

    }

    }

