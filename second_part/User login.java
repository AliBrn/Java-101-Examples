package patikajava.ikinci_kisim;

import java.util.Scanner;

public class User login {
    //Kullanıcı Girişli Bilgi Sistemi Şifre değiştirebilmeli
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Kullanıcı adı girin");
        String k_ad= klavye.nextLine();
        System.out.println("Şifre girin");
        String password= klavye.nextLine();



        if (k_ad.equals("patikadev") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");

        }else {
            System.out.println("Hatalı giriş");
            System.out.println("Şifre değiştirmek ister misiniz \n 1-EVET \n 2-Hayır");
            int x= klavye.nextInt();
            if (x==1){
                System.out.println("Yeni şifrenizi girin");
                String pass =klavye.next();
                if (password.equals(pass)) {
                    System.out.println("Yeni şifreniz eskisi ile aynı");
                }
                else {
                    System.out.println("Şifreniz değiştirildi");
                }

            } else if (x==2) {
                System.out.println("Şifreniz değiştirilmedi");
            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }



    }
}
