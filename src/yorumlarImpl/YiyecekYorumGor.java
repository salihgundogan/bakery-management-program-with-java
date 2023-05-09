package yorumlarImpl;

import yorumlar.YiyecekYorum;

import java.util.Scanner;

public class YiyecekYorumGor implements YiyecekYorum {
    Scanner input = new Scanner(System.in);

    @Override
    public void yiyecekYorum() {
        String yiyecekYorum;
        System.out.println("Yiyecekler hakkında şikayet veya memnuniyet dolu sözlerinizi bekliyoruz: ");
        yiyecekYorum = input.nextLine();
    }
}
