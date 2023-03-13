package patikajava.recursive;

public class alıstırma19 {
    // kendisine parametre olarak geşen  karakter dizissindeki küçük 'x'sayısnı bulan
    public static int bulma(char x[],int i){
        if (x.length==i) {
             return 0;
        } else if (x[i]=='x') {
            return  1+bulma(x,i+1);

        }else {
            return  bulma(x,i+1);
        }

    }




    public static void main(String[] args) {
        char d[]={'x','e','f','g','h','x','x','a'};
        System.out.println(bulma(d,0));

    }
}