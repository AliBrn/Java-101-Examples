package patikajava.recursive;

public class alıstırma5 {
    //  girilen iki sayı rasındaki toplamları hesaplayan  recursive metodu. Not:ilk sayı küçük.
    public static int topla(int a,int b,int i){
        if (b==i){
            return i;
        }else{
            return i+topla(a,b,++i);

        }

    }

    public static void main(String[] args) {
        System.out.println(topla(9,18,9));
    }
}
