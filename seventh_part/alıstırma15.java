package patikajava.recursive;

public class alıstırma15 {
    //1+4+7.. şeklinde gidenn sayı dizinin ilk 10 elamaınnı toplayan rekürsif metodu
    public static int topla(int i,int x){
        if (i==0){
            return 0;
        }
        else {
            return  x+topla(i-1,x+3);
        }

    }
    public static void main(String[] args) {
        System.out.println(topla(10,1));

    }
}
