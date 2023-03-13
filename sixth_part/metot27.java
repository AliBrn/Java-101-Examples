package patikajava.metotlar;

public class metot27 {
    // kendsinie parametre olarak gelen iki boyutlu sayısal dizi içindeki en büyük sayıyı kaçıncı satır ve sütunda oldugunu bulup geri
     //döndüren metot
    public  static int[] özellikler(int f[][]){
        int max=f[0][0];
        int imax=0,jmax=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                if (max<f[i][j]){
                    max=f[i][j];
                    imax=i;
                    jmax=j;
                }
            }
        }int d[]={max,imax,jmax};
        return d;



    }
    public static void main(String[] args) {
        int x[][]={{5,4,3},{7,9,11},{13,15,21}};
        int d[]=özellikler(x);
        for (int i = 0; i <d.length ; i++) {
            System.out.println(d[i]);
        }
    }
}
