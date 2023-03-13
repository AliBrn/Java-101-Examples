package patikajava.recursive;

public class alıstırma21 {
    public static int toplama(int a[],int b[],int i){
        if (a.length==i){
            return 0;
        } else if (a[i]==b[i]) {
            return  a[i]+toplama(a,b,i+1);
        }else {
            return toplama(a,b,i+1);
        }

    }

    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int b[]={6,4,3,1,8};
        System.out.println(toplama(a,b,0));

    }
}
