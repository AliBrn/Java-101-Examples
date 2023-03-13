package patikajava.ucuncu_kisim;

import java.util.Scanner;

public class ATM Project {
    //Bankamatik İşlemleri Yapan Java Programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int balance=1500,right=3,select,withdraw,invest;
        String username,password;
        while (right>0){
            System.out.print("Kullanıcı adı girin:");
            username= klavye.next();
            System.out.print("Şifre girin:");
            password= klavye.next();
            if (username.equals("patika")&& password.equals("java123") ){
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçin:");
                    System.out.println(" 1-Para Çekme \n 2-Para Yatırma \n 3-Bakiye Görüntüleme \n 4-Çıkış İşlemi");
                     select= klavye.nextInt();
                     switch (select){

                         case 1:
                             System.out.println("Ne kadar para çekmek istiyorsunuz");
                             withdraw= klavye.nextInt();
                             if (withdraw>balance){
                                 System.out.println("Bakiye Yetersiz");
                             }else{
                                 balance-=withdraw;
                                 System.out.println("Yeni bakiye:"+balance);
                             }
                             break;
                         case 2:
                             System.out.println("Ne kadar para Yatırmak istiyorsunuz");
                             invest= klavye.nextInt();
                             balance+=invest;
                             System.out.println("Yeni bakiye:"+ balance);
                             break;
                         case 3:
                             System.out.println("Bakiyeniz:"+balance);
                             break;
                         case 4:
                             System.out.println("İyi günler,tekrar görüşmek üzere.");
                             break;
                     }

                }while (select!=4);
                break;
            }else{
                --right;
                System.out.println("Kullanıcı adı veya şifre hatalı tekrar deneyiniz");
                if (right==0){
                    System.out.println("Çok fazla hatalı işlem yaptınız hesabınız bloke oldu");
                }else {
                    System.out.println("Kalan hak:"+ right);
                }
            }
        }
    }
}
