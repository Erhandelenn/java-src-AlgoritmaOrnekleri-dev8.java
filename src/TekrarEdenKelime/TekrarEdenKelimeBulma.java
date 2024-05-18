package TekrarEdenKelime;
import java.util.HashSet;
import java.util.Set;
public class TekrarEdenKelimeBulma {
    public static void main(String[] args) {
        String Giris = "merhaba bugün sen nasıl oldun, sen dün işe gelmedin. nasıl olduğunu merak ettim";
        String tekrarEdenKelime = TekrarEdenKelimeyiBul(Giris);
        System.out.println("Tekrar eden kelime: " + tekrarEdenKelime);
    }
    public static String TekrarEdenKelimeyiBul(String sentence) {
        String cleanedSentence = sentence.replaceAll("[.,]", "").toLowerCase();

        String[] words = cleanedSentence.split(" ");

        Set<String> wordSet = new HashSet<>();

        for (String word : words) {

            if (wordSet.contains(word)) {
                return word;
            }
            wordSet.add(word);
        }
        return null;
    }
}