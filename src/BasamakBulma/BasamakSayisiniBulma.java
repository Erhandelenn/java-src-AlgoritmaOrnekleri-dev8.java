package BasamakBulma;
import java.util.Scanner;

public class BasamakSayisiniBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int basamakSayisi = basamakSayisiniBul(sayi);
        System.out.println("Girilen sayının basamak sayısı: " + basamakSayisi);
    }

    public static int basamakSayisiniBul(int sayi) {
        int mutlakDeger = Math.abs(sayi);
        return String.valueOf(mutlakDeger).length();
    }
}