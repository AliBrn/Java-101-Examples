package patikajava.metotlar;

public class metot24 {
    //kendisine parametre olarak gelen iki boyutlu sayısal matrisin birim matris olup olmadıgını kontrol eden metot.
    public static boolean birim_matris(int a[][]){
        if (a.length!=a[0].length){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if (i==j && a[i][j]!=1)
                    return false;
                if (i!=j && a[i][j]!=0)
                    return false;
            }
        }return true;
    }


    public static void main(String[] args) {
        int a[][]={{1,0,0},{0,0,0},{0,0,1}};
        System.out.println(birim_matris(a));


    }
}
