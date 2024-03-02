import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoşgeldiniz!");
        System.out.print("Hangi kahveyi istersiniz?" +

                         "\n- Türk Kahvesi" +
                         "\n- Filtre Kahve" +
                         "\n- Espresso" +

                         "\nİstediğiniz kahve çeşidini yazınız: ");

        String hangiKahve = scanner.nextLine();

        if (hangiKahve.equalsIgnoreCase("Türk kahvesi")) {
            System.out.println("Türk kahvesi hazırlanıyor...");
        } else if (hangiKahve.equalsIgnoreCase("Filtre kahve")) {
            System.out.println("Filtre kahve hazırlanıyor...");
        } else if (hangiKahve.equalsIgnoreCase("Espresso")){
            System.out.println("Espresso hazırlanıyor...");
        } else {
            System.out.println("Hatalı yazım, tekrar istediğiniz kahveyi yazınız.");
        }

        System.out.print("Süt eklemek ister misiniz? (Evet/Hayır): ");
        String sut = scanner.nextLine();
        
        if (sut.equalsIgnoreCase("Evet")) {
            System.out.println("Süt ekleniyor...");
        } else if (sut.equalsIgnoreCase("Hayır")) {
            System.out.println("Süt eklenmiyor");
        } else {
            System.out.println("Hatalı yazım");
        }

        System.out.print("Şeker ister misiniz? (Evet/Hayır): ");
        String seker = scanner.nextLine();
        int kacSeker;

        if (seker.equalsIgnoreCase("Evet")) {
            System.out.print("Kaç şeker olsun? : ");
            kacSeker = scanner.nextInt();
            System.out.println(kacSeker + " tane şeker ekleniyor...");
        } else {
            System.out.println("Şeker eklenmiyor");
        }

        System.out.println("Kahveniz hazır. Afiyet olsun!");
    }
}
