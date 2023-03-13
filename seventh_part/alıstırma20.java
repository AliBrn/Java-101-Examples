package patikajava.recursive;

public class alıstırma20 {

    public static String silme(String x,int i){
        if (x.length()==i){
            return "";
        } else if (x.charAt(i)!=' ') {
            return  x.charAt(i)+silme(x,i+1);
        }else {
            return silme(x,i+1);
        }
    }







    public static void main(String[] args) {
     String me="ytadqe eqeq";
        System.out.println(silme(me,0));
    }
}
