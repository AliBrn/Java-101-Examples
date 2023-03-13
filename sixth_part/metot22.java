package patikajava.metotlar;

import java.util.Scanner;

public  class metot22 {
    //Klavyeden girilen iki Stringin yerleri aynı olmak şartıyla birbirinden farklı olan karakterleri birleştirip geri döndüren
    //methodu  yazan program(Stringler eşit uzunlukta).
 public static String birlestirme(String a,String b){
     String str="";
     for (int i = 0; i <a.length() ; i++) {
         if (a.charAt(i)!=b.charAt(i)){
           str=str +b.charAt(i)+a.charAt(i);

         }
     }return str;
 }

    public static void main(String[] args) {
      Scanner klavye=new Scanner(System.in);
      String x= klavye.next();
      String y= klavye.next();
        System.out.println(birlestirme(x,y));

    }
}
