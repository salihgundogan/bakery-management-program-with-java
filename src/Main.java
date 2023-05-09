import java.util.Scanner;

import menü.Menu;
import menü.Yiyecek;
import menü.Icecek;
import yorumlarImpl.PastaneYorumGor;
import yorumlarImpl.YiyecekYorumGor;
import yorumlarImpl.IcecekYorumGor;


public class Main {
    public static void main(String[] args) {

        Yiyecek yiyecek = new Yiyecek();
        Icecek icecek = new Icecek();
        Menu menu = new Menu();
        PastaneYorumGor pastaneYorumGor = new PastaneYorumGor();
        YiyecekYorumGor yiyecekYorumGor = new YiyecekYorumGor();
        IcecekYorumGor icecekYorumGor = new IcecekYorumGor();


        System.out.println("-------------------------------------------------------------");
        System.out.println("            *** Petek Pastanesine Hoşgeldiniz ***");
        System.out.println("-------------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        int tercih, secme, durum = 1;
        char yorumTercih;
        while (durum == 1) {
            System.out.println("                            MENU");
            System.out.println("-------------------------------------------------------------");
            System.out.println("            1.Yiyecek \t 2.İçecek \t 3.Çıkış");
            tercih = input.nextInt();
            switch (tercih) {
                case 1: {
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("                      **YİYECEKLER**");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("1.Kuru Pasta \t 2.Yaş Pasta \t 3.Tatlılar \t 4.Geri");
                    secme = input.nextInt();
                    switch (secme) {
                        case 1:
                            yiyecek.yiyecekMenusuKuruPasta();
                            break;
                        case 2:
                            yiyecek.yiyecekMenusuYasPasta();
                            break;
                        case 3:
                            yiyecek.yiyecekMenusuTatlilar();
                            break;
                        case 4:
                            break;
                        default:
                    }
                    break;
                }
                case 2:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("                      **İÇECEKLER**");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("1.Sıcak \t 2.Soğuk \t 3.Geri");
                    secme = input.nextInt();
                    switch (secme) {
                        case 1:
                            icecek.sicakIcecek();
                            break;
                        case 2:
                            icecek.sogukIcecek();
                            break;
                        case 3:
                            break;
                        default:
                    }
                    break;
                case 3:
                    System.out.println("        Pastanemiz hakkında yorum yapmak ister misiniz ?");
                    System.out.println("                          Y / N");
                    yorumTercih = input.next().charAt(0);

                    if (yorumTercih == 'Y') {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("ilk yapacağınız pastane sonraki yiyecekler ve içecekler hakkındaki görüşleriniz içindir. Teşekkür ederiz..");
                        pastaneYorumGor.pastaneYorum();
                        yiyecekYorumGor.yiyecekYorum();
                        icecekYorumGor.icecekYorum();
                        durum += 1;
                    } else {
                        System.out.println("İyi günler yine bekleriz..:)");
                        durum += 1;
                    }
            }
        }
    }
}