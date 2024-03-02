import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        /*
        Kullanıcıya
        1) Günde kaç bardak çay içtiğini,
        2) Her bardak için kaç şeker kullandığını sorup,
        kullanıcının yıllık ve kırk yıllık şeker tüketimini kg bazında konsola yazdıran bir program yazın
        kullanıcı eger seker kullanmadıysa "Aferin, böyle devam et :)" cıktısını görsün
        (Bir adat küp seker = 2.77 gr) (1000gr = 1kg)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Günde kaç bardak çay içiyorsunuz?: ");
        int cayMiktari = scanner.nextInt();

        System.out.print("Her bardak için kaç adet küp şeker kullanıyorsunuz?: ");
        int sekerMiktari = scanner.nextInt();

        double gunlukSekerTuketimi = cayMiktari * sekerMiktari * 2.77;
        double yillikSekerTuketimi = ((gunlukSekerTuketimi * 365) / 1000);
        double kirkYillikSekerTuketimi = ((yillikSekerTuketimi * 40) / 1000);

        if (sekerMiktari > 0) {
            System.out.println("Yıllık şeker tüketiminiz: " + yillikSekerTuketimi);
            System.out.println("Kırk yıllık şeker tüketiminiz: " + kirkYillikSekerTuketimi);
        } else {
            System.out.println("Aferin, böyle devam et :)");
        }
    }
}
