package patikajava.recursive;

public class alıstırma12 {
    //üs alma  yapan  rekürsif metodu
    public static int us_alma(int a,int b){
        if (b<=0){
            return 1;
        }

        else {
            return a*us_alma(a,b-1);
        }

    }


    public static void main(String[] args) {
        System.out.println(us_alma(3,4));
    }
}
