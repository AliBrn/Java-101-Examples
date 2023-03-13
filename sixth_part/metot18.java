package patikajava.metotlar;

public class metot18 {
    // kendisine parametre olarak gelen iki boyutlu String dizisindeki son karakterleri küçük a olan ifadeleri bulup ekrana yazan
    // indis, değer
    public static void kucuk_abulma(String a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j].charAt(a[i][j].length() - 1) == 'a')
                    System.out.println(a[i][j] + "" + i + "" + j);
            }
        }
    }


    public static void main(String[] args) {
        String a[][] ={{"Ali","ayşe","ayla"},{"ahmet","mustafa","kama"}};
        kucuk_abulma(a);


    }
}
