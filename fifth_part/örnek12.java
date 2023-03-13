package patikajava.ikiboyutludiziler;

public class örnek12 {
    public static void main(String[] args) {
        // iki boyutlu sayısal dizinin matrislerinin toplamı
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{5,6,7},{3,2,5},{7,9,1}};
        int toplam[][]=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                toplam[i][j]=a[i][j]+b[i][j];
                System.out.print(toplam[i][j]+",");
            }
        }

    }
}
