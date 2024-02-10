package Proje;

import java.util.Scanner;

public class _01_Proje {

 public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kahve Çeşitleri :");
        System.out.println("1 - Türk kahvesi");
        System.out.println("2 - Filtre kahve");
        System.out.println("3 - Espresso");
        System.out.print("Hangi kahveyi istersiniz (1/3):");
        int kahveSecimi=0;
        String kahve=" ";


        while (kahveSecimi<1 || kahveSecimi>3){
            kahveSecimi=input.nextInt();

            switch (kahveSecimi){

                case 1:kahve="Türk kahvesi"; System.out.println(kahve+" hazırlanıyor.");break;
                case 2:kahve="Filtre kahve"; System.out.println(kahve+" hazırlanıyor.");break;
                case 3:kahve="Espresso"; System.out.println(kahve+" hazırlanıyor.");break;
                default:
                    System.out.print("Hatalı giriş yaptınız. Lütfen Kahvenizi tekrar seçiniz:");break;
            }
        }
        input.nextLine();
        System.out.print("Süt eklememizi ister misiniz(Evet/Hayır) :");
        String sutSecimi= input.nextLine();
        boolean sut=sutSecimi.equalsIgnoreCase("evet");

        if (sut){
            System.out.println(kahve+ " sütlü hazırlanıyor... ");
        }else {
            System.out.println(kahve+ " sütsüz hazırlanıyor...");
        }

     System.out.print("Şeker ister misiniz(Evet/Hayır):");
        String sekerSecimi=input.nextLine();
        boolean seker=sekerSecimi.equalsIgnoreCase("evet");

        if (seker){
            System.out.print("Kaç şeker istersiniz: ");
            int sekerSayisi=input.nextInt();
            System.out.println(kahve+" "+sekerSayisi+" adet şeker ekleniyor...");
        }else {
            System.out.println(kahve+" şekersiz hazırlanıyor...");
        }

     System.out.println("Kahveniz için bardak çeşitleri: ");
     System.out.println("1- Büyük boy");
     System.out.println("2- Orta boy");
     System.out.println("3- Küçük boy");
     System.out.print("Kahveniz için bardak seçiniz(1-3): ");
     int bardakSecimi=0;
     String bardak="";
     while (bardakSecimi<1 || bardakSecimi>3){
         bardakSecimi= input.nextInt();


         switch (bardakSecimi){
             case 1: bardak="Büyük"; System.out.println(kahve+" "+bardak+" bardakta hazırlanıyor...");break;
             case 2: bardak="Orta"; System.out.println(kahve+" "+bardak+" bardakta hazırlanıyor...");break;
             case 3: bardak="Küçük"; System.out.println(kahve+" "+bardak+" bardakta hazırlanıyor...");break;
             default:
                 System.out.print("Hatalı giriş yaptınız. Lütfen Tekrar bardak seçimi yapınız:");break;
         }
     }
     System.out.println(bardak+" bardakta "+kahve+" siparişiniz hazır.");
 }}