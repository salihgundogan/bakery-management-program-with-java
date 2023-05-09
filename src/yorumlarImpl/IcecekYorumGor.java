package yorumlarImpl;

import yorumlar.IcecekYorum;

import java.util.Scanner;

public class IcecekYorumGor implements IcecekYorum {
    Scanner input = new Scanner(System.in);

    @Override
    public void icecekYorum() {
        String icecekYorum;
        System.out.println("İçecekler hakkında şikayet veya memnuniyet dolu sözlerinizi bekliyoruz: ");
        icecekYorum = input.nextLine();
        System.out.println("Görüşleriniz için çok teşekkür ederiz, İyi günler diler yine bekleriz..");
    }
}
