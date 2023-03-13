package patikajava.metotlar;

public class metot16 {
    // kendisine paramter olarak gelen iki sayısal diziyi karşılaştırıp büyük olan değeri farklı bir diziye aktarma


    public static void karsılastırma(int a[], int b[]) {
        int c[] = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b[i]) {
                c[k] = a[i];
                k++;
            }
                if (b[i] > a[i]) {
                    c[k] = b[i];
                    k++;
                }





        }
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }



    }

    public static void main(String[] args) {
        int a[] = {5, 4, 2, 1, 7, 8};
        int b[] = {3, 6, 1, 25, 7, 9};
        karsılastırma(a, b);


    }
}
