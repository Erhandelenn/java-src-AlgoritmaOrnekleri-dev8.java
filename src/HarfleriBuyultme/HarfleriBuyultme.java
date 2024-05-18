package HarfleriBuyultme;
public class HarfleriBuyultme {
    public static void main(String[] args) {
        String input = "selam nasıl gidiyor";
        String output = toTitleCase(input);
        System.out.println(output);
    }
    public static String toTitleCase(String input) {

        String[] kelimeler = input.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String kelime : kelimeler) {
            if (kelime.length() > 0) {

                String capitalizedWord = kelime.substring(0, 1).toUpperCase() + kelime.substring
                        (1).toLowerCase(); titleCase.append(capitalizedWord).append(" ");
            }
        }
        return titleCase.toString().trim();
    }
}
