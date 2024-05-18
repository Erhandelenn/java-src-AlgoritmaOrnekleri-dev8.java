package PolindromSorgulama;
public class PolindromKontrol {
    public static void main(String[] args) {
        String kelime1 = "abccba";
        String kelime2 = "abbcdcbba";
        String kelime3 = "abbccdabbccd";

        System.out.println("Kelime1 \"" + kelime1 + "\" palindrom mu? " + palindromMu(kelime1));
        System.out.println("Kelime2 \"" + kelime2 + "\" palindrom mu? " + palindromMu(kelime2));
        System.out.println("Kelime3 \"" + kelime3 + "\" palindrom mu? " + palindromMu(kelime3));
    }
    public static boolean palindromMu(String kelime) {
        int uzunluk = kelime.length();

        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}