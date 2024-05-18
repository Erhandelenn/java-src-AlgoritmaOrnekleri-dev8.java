package AsalSayi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        List<Integer> asalCarpanlar = asalCarpanlariBul(sayi);
        if (asalCarpanlar.isEmpty()) {
            System.out.println("Bu sayının asal çarpanı yoktur.");
        } else {
            System.out.println("Girilen sayının asal çarpanları: " + asalCarpanlar);
        }
    }
    public static List<Integer> asalCarpanlariBul(int sayi) {
        List<Integer> asalCarpanlar = new ArrayList<>();
        int carpan = 2;

        while (sayi > 1) {
            if (sayi % carpan == 0) {
                asalCarpanlar.add(carpan);
                sayi /= carpan;
                while (sayi % carpan == 0) {
                    sayi /= carpan;
                }
            }
            carpan++;
        }
        return asalCarpanlar;
    }
}