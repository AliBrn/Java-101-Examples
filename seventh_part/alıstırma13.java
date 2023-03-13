package patikajava.recursive;

public class alıstırma13 {
    // girilen sayı kadar adını yazan fonksiyon
    public static void yazma(int a){
        if (a==0){

        }
        else{
            System.out.println("alasda");
            yazma(a-1);
        }
    }

    public static void main(String[] args) {
        yazma(7);

    }
}

