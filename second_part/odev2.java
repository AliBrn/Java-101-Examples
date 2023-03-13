package patikajava.ikinci_kisim;

import java.util.Scanner;

public class odev2 {
    //Çin Zodyağı hesaplayan Java programı
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String str="";
        System.out.println("Doğum yılınızı giriniz");
        int x= klavye.nextInt();

        switch (x%12){
            case 0:{
                 str="Maymun";
                 break;
            }
            case 1:{
                str="Horoz";
                break;
            } case 2:{
                str="Köpek";
                break;
            }case 3:{
                 str="Domuz";
                 break;
            }case 4:{
                str="Fare";
                break;
            }case 5:{
                str="Öküz";
                break;
            }case 6:{
                str="Kaplan";
                break;
            }case 7:{
               str="Tavşan";
               break;
            }case 8:{
                 str="Ejderha";
                 break;
            }case 9:{
                 str="Yılan";
                 break;
            }case 10:{
                str="At";
                break;
            }case 11:{
              str="Koyun";
              break;
            }
        }
        System.out.println("Çin Zodyağı Değeri:"+str);
    }
}
