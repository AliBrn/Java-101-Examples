package patikajava.metotlar;

public class metot14 {
    // kendisine parametre olarak gelen sayısal diznin  sıralı olup olmadıgını bulma
    public static void sıralımı(int a[]){
        for (int i = 0; i <a.length-1 ; i++) {
            if (a[i] >= a[i + 1]) {
                System.out.println("sıralı değil");
                System.exit(1);
            }

        }
        System.out.println("sıralı");
    }




    public static void main(String[] args) {
        int b[]={1,2,3,4,5,6,7};
        sıralımı(b);

    }
}
