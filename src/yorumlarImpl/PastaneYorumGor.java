package yorumlarImpl;

import yorumlar.PastaneYorum;

import java.util.Scanner;

public class PastaneYorumGor implements PastaneYorum {
    Scanner input = new Scanner(System.in);

    @Override
    public void pastaneYorum() {
        String pastaneYorum;
        System.out.println("Pastane hakkında şikayet veya memnuniyet dolu sözlerinizi bekliyoruz: ");
        pastaneYorum = input.nextLine();
    }
}
