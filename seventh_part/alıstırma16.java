package patikajava.recursive;

public class alıstırma16 {
    //1*3*5... şeklinde giden tek sayıları çarpan dizinin  rekürsif metodu;
    public static int carpım(int x,int i){
        if (x==0){
            return 1;
        }else {
            return  i*carpım(x-1,i+2);
        }

    }
    public static void main(String[] args) {
        System.out.println(carpım(10,1));
    }
}
