package patikajava.metotlar;

public class metot26 {
    // kendsiine parametre olarak gelen iki sayısal diziyi birleştirip tek bir dizi haline getiren ve bu diziyi geri döndüren metot
 public static int[] diziler(int a[],int b[]){
     int c[]=new int[a.length+b.length];
     int k=0;
     for (int i = 0; i < a.length ; i++) {
         c[k] = a[i];
         k++;
     }
     for (int i = 0; i <b.length ; i++) {
         c[k]=b[i];
         k++;
     }return c;




 }

    public static void main(String[] args) {
     int x[]={15,6,7,12,515};
     int y[]={12,56,21,56,125};
     int c[]=diziler(x,y);
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]+",");
        }



    }
}
