import java.util.Random;
import java.util.Scanner;

public class Practice04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int kullaniciSkor = 0;
        int bilgisayarSkor = 0;

        System.out.println("Oyun başladı!");

        for (int i = 0; i < 5; i++) {

            System.out.println("-----------------------");

            System.out.print("1: Taş" +
                             "\n2: Kağıt " +
                             "\n3: Makas" +
                             "\nSeçimi yapınız: ");

            int kullaniciSecimi = scanner.nextInt();
            int bilgisayarSecimi = random.nextInt(1,4);

            if (kullaniciSecimi == bilgisayarSecimi) {
                System.out.println("Bilgisayarın seçimi: " +  bilgisayarSecimi);
                System.out.println("Berabere!");
            } else if ((kullaniciSecimi == 1 && bilgisayarSecimi == 3) ||
                      (kullaniciSecimi == 2 && bilgisayarSecimi == 1) ||
                      (kullaniciSecimi == 3 && bilgisayarSecimi == 2)) {
                System.out.println("Bilgisayarın seçimi: " + bilgisayarSecimi);
                System.out.println("Kazandınız! ");
                kullaniciSkor++;
            } else {
                System.out.println("Bilgisayarın seçimi: " + bilgisayarSecimi);
                System.out.println("Bilgisayar kazandı! ");
                bilgisayarSkor++;
            }
        }

        if (kullaniciSkor > bilgisayarSkor) {
            System.out.println("Oyunu kazandınız!");
        } else if (bilgisayarSkor > kullaniciSkor) {
            System.out.println("Maalasef kaybettiniz.");
        } else {
            System.out.println("Oyun berabere!");
        }
    }
}
