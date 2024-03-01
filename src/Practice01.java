import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen adınızı ve soyadınızı giriniz: ");
        String girilenIsimSoyisim = scanner.nextLine();

        int boslukIndex = girilenIsimSoyisim.indexOf(" ");

        String ad = girilenIsimSoyisim.substring(0,boslukIndex);
        String soyad = girilenIsimSoyisim.substring(boslukIndex+1);

        String duzeltilmisAd = ad.substring(0,1).toUpperCase() + ad.substring(1).toLowerCase();
        String duzeltilmisSoyad = soyad.toUpperCase();

        System.out.println("Adınız: " + duzeltilmisAd + "\nSoyadınız: " + duzeltilmisSoyad);







        






    }
}
